import { DecimalPipe, NgFor } from '@angular/common';
import { Component, PipeTransform, QueryList, ViewChildren } from '@angular/core';
import { FormControl, FormsModule } from '@angular/forms';
import { NgbTypeaheadModule, NgbPaginationModule } from '@ng-bootstrap/ng-bootstrap';
import { Observable, startWith, map } from 'rxjs';
import { NgbdSortableHeader, SortEvent } from './sortable.directive';
import { User } from 'src/app/models/user';
import { UserService } from 'src/app/services/user.service';
import { usersService } from './users.service';

@Component({
  selector: 'users-list',
  templateUrl: './UsersList.component.html',
  styleUrls: ['./UsersList.component.css'],
  providers: [usersService, DecimalPipe]
})

export class UsersListComponent {
  	users$!: Observable<User[]>;
	total$!: Observable<number>;
	hasData$!: Observable<boolean>;

	@ViewChildren(NgbdSortableHeader)
  	headers!: QueryList<NgbdSortableHeader>;

	  constructor(public service: usersService) {
	}
	ngOnInit(): void{
		this.users$ = this.service.users$;
		this.total$ = this.service.total$;
		this.hasData$ = this.users$.pipe(map(users => users.length > 0));

		// check is data being emitting
		// this.users$.subscribe(users => console.log('Fetched users:', users));
	}
	onSort({ column, direction }: SortEvent) {
		this.headers.forEach((header) => {
			if (header.sortable !== column) {
				header.direction = '';
			}
		});
		this.service.sortColumn = column;
		this.service.sortDirection = direction;
	}
}