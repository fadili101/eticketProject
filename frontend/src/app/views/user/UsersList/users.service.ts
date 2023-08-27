import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable, Subject, debounceTime, delay, of, switchMap, tap } from 'rxjs';
import { SortColumn, SortDirection } from './sortable.directive';
import { DecimalPipe } from '@angular/common';
import { User } from 'src/app/models/user';
import { Caisse } from 'src/app/models/caisse';
import { Departement } from 'src/app/models/departement';
import { Profil } from 'src/app/models/profil';
import { UserService } from '../../../services/user.service'
interface SearchResult {
	users: User[];
	total: number;
}

interface State {
	page: number;
	pageSize: number;
	searchTerm: string;
	sortColumn: SortColumn;
	sortDirection: SortDirection;
}

const compare = (v1: string | number | boolean | Caisse[] | Profil | Departement, v2: string | number | boolean | Caisse[] | Profil | Departement) => (v1 < v2 ? -1 : v1 > v2 ? 1 : 0);

function sort(users: User[], column: SortColumn, direction: string): User[] {
	if (direction === '' || column === '') {
		return users;
	} else {
		return [...users].sort((a, b) => {
			const res = compare(a[column], b[column]);
			return direction === 'asc' ? res : -res;
		});
	}
}

function matches(user: User, term: string) {
	return (
		user.nomUser.toLowerCase().includes(term.toLowerCase()) ||
		String(user.prenomUser).toLowerCase().includes(term.toLowerCase()) ||
		String(user.login).toLowerCase().includes(term.toLowerCase())
	);
}


@Injectable({
	providedIn: 'root'
})
export class usersService {
	private _loading$ = new BehaviorSubject<boolean>(true);
	private _search$ = new Subject<void>();
	private _users$ = new BehaviorSubject<User[]>([]);
	private _total$ = new BehaviorSubject<number>(0);
	USERS: User[] = [];
	private _state: State = {
		page: 1,
		pageSize: 4,
		searchTerm: '',
		sortColumn: '',
		sortDirection: '',
	};

	constructor(private http: HttpClient,
		private pipe: DecimalPipe,
		private userService: UserService
	) {
		console.log('test')
		this.userService.getUsers().subscribe(
			data => {
				this.USERS = data;
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
				this._users$.next(result.users);
				this._total$.next(result.total);
			});
		this._search$.next();
	}

	get users$() {
		return this._users$.asObservable();
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
		let users = sort(this.USERS, sortColumn, sortDirection);

		// 2. filter
		users = users.filter((user) => matches(user, searchTerm));
		const total = users.length;

		// 3. paginate
		users = users.slice((page - 1) * pageSize, (page - 1) * pageSize + pageSize);
		return of({ users, total });
	}
}
