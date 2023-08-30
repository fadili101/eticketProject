import { DecimalPipe } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable, Subject, debounceTime, delay, of, switchMap, tap } from 'rxjs';
import { SortColumn, SortDirection } from './HistsSortable.directive';
import { HistGesaur } from 'src/app/models/histgesaur';
import { HistService } from 'src/app/services/hist.service';

interface SearchResult {
	hists: HistGesaur[];
	total: number;
}

interface State {
	page: number;
	pageSize: number;
	searchTerm: string;
	sortColumn: SortColumn;
	sortDirection: SortDirection;
}

const compare = (v1: string | number | Date, v2: string | number | Date) => v1 < v2 ? -1 : v1 > v2 ? 1 : 0;

function sort(departements: HistGesaur[], column: SortColumn, direction: string): HistGesaur[] {
	if (direction === '' || column === '') {
	return departements;
	} else {
	return [...departements].sort((a, b) => {
			const res = compare(a[column], b[column]);
			return direction === 'asc' ? res : -res;
		});
	}
}

function matches(hist: HistGesaur, term: string) {
	const searchTerm = term.toLowerCase();
	return (
	  String(hist.nomClient).toLowerCase().includes(searchTerm) ||
	  String(hist.caissier).toLowerCase().includes(searchTerm) ||
	  String(hist.modePaiement).toLowerCase().includes(searchTerm) ||
	  String(hist.nticket).toLowerCase().includes(searchTerm) ||
	  (typeof hist.montantHT === 'number' && String(hist.montantHT).includes(searchTerm)) ||
	  (typeof hist.montantTTC === 'number' && String(hist.montantTTC).includes(searchTerm)) ||
	  (typeof hist.montantTVA === 'number' && String(hist.montantTVA).includes(searchTerm))
	);
  }


@Injectable({
	providedIn: 'root'
})
export class HistesService {
	private _loading$ = new BehaviorSubject<boolean>(true);
	private _search$ = new Subject<void>();
	private _hists$ = new BehaviorSubject<HistGesaur[]>([]);
	private _total$ = new BehaviorSubject<number>(0);
	HISTS: HistGesaur[] = [];
	private _state: State = {
		page: 1,
		pageSize: 4,
		searchTerm: '',
		sortColumn: '',
		sortDirection: '',
	};

	constructor(private http: HttpClient,
		private pipe: DecimalPipe,
		private histService: HistService
	) {
		this.histService.getHists().subscribe(
			data => {
				this.HISTS = data;
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
				this._hists$.next(result.hists);
				this._total$.next(result.total);
			});
		this._search$.next();
	}
	refreshData() {
        this.histService.getHists().subscribe(
            data => {
                this.HISTS = data;
                this._search$.next(); // Trigger a new search to update observables
            }
        );
    }
	get hists$() {
		return this._hists$.asObservable();
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
		let hists = sort(this.HISTS, sortColumn, sortDirection);

		// 2. filter
		hists = hists.filter((hist) => matches(hist, searchTerm));
		const total = hists.length;

		// 3. paginate
		hists = hists.slice((page - 1) * pageSize, (page - 1) * pageSize + pageSize);
		return of({ hists, total });
	}
}
