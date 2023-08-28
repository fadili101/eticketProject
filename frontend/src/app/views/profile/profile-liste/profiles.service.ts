import { DecimalPipe } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable, Subject, debounceTime, delay, of, switchMap, tap } from 'rxjs';
import { SortColumn, SortDirection } from './ProfileSortable.directive';
import { Departement } from 'src/app/models/departement';
import { profileService } from 'src/app/services/profile.service';
import { User } from 'src/app/models/user';
import { Profil } from 'src/app/models/profil';
interface SearchResult {
	profiles: Profil[];
	total: number;
}

interface State {
	page: number;
	pageSize: number;
	searchTerm: string;
	sortColumn: SortColumn;
	sortDirection: SortDirection;
}

const compare = (v1: string | number | Departement | Departement[] | User[] | null, v2: string | number | Departement | Departement[] | User[] | null) => {
	if (v1 === null && v2 === null) {
	  return 0;
	} else if (v1 === null) {
	  return -1;
	} else if (v2 === null) {
	  return 1;
	} else {
	  return v1 < v2 ? -1 : v1 > v2 ? 1 : 0;
	}
  };

function sort(departements: Profil[], column: SortColumn, direction: string): Profil[] {
	if (direction === '' || column === '') {
		return departements;
	} else {
		return [...departements].sort((a, b) => {
			const res = compare(a[column], b[column]);
			return direction === 'asc' ? res : -res;
		});
	}
}

function matches(profile: Profil, term: string) {
	return (
		String(profile.nomProfil).toLowerCase().includes(term.toLowerCase()) ||
		String(profile.description).toLowerCase().includes(term.toLowerCase())
	);
}


@Injectable({
	providedIn: 'root'
})
export class ProfilesService {
	private _loading$ = new BehaviorSubject<boolean>(true);
	private _search$ = new Subject<void>();
	private _profiles$ = new BehaviorSubject<Profil[]>([]);
	private _total$ = new BehaviorSubject<number>(0);
	PROFILES: Profil[] = [];
	private _state: State = {
		page: 1,
		pageSize: 4,
		searchTerm: '',
		sortColumn: '',
		sortDirection: '',
	};

	constructor(private http: HttpClient,
		private pipe: DecimalPipe,
		private ProfileSerice: profileService
	) {
		this.ProfileSerice.getProfiles().subscribe(
			data => {
				this.PROFILES = data;
			}
		)
		this._search$
			.pipe(
				tap(() => this._loading$.next(true)),
				debounceTime(200),
				switchMap(() => this._search()),
				delay(200),
				tap(() => this._loading$.next(false)),
			)
			.subscribe((result) => {
				this._profiles$.next(result.profiles);
				this._total$.next(result.total);
			});
		this._search$.next();
	}
	refreshData() {
        this.ProfileSerice.getProfiles().subscribe(
            data => {
                this.PROFILES = data;
                this._search$.next(); // Trigger a new search to update observables
            }
        );
    }
	get profiles$() {
		return this._profiles$.asObservable();
	}
	get total$() {
		return this._total$.asObservable();
	}
	get loading$() {
		return this._loading$.asObservable();
	}
	get page() {
		return this._state.page;
	}
	get pageSize() {
		return this._state.pageSize;
	}
	get searchTerm() {
		return this._state.searchTerm;
	}

	set page(page: number) {
		this._set({ page });
	}
	set pageSize(pageSize: number) {
		this._set({ pageSize });
	}
	set searchTerm(searchTerm: string) {
		this._set({ searchTerm });
	}
	set sortColumn(sortColumn: SortColumn) {
		this._set({ sortColumn });
	}
	set sortDirection(sortDirection: SortDirection) {
		this._set({ sortDirection });
	}

	private _set(patch: Partial<State>) {
		Object.assign(this._state, patch);
		this._search$.next();
	}
	private _search(): Observable<SearchResult> {
		const { sortColumn, sortDirection, pageSize, page, searchTerm } = this._state;

		// 1. sort
		let departements = sort(this.PROFILES, sortColumn, sortDirection);

		// 2. filter
		departements = departements.filter((departement) => matches(departement, searchTerm));
		const total = departements.length;

		// 3. paginate
		departements = departements.slice((page - 1) * pageSize, (page - 1) * pageSize + pageSize);
		return of({ departements, total });
	}
}
