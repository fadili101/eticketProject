import { DecimalPipe } from '@angular/common';
import { Component, QueryList, ViewChildren } from '@angular/core';
import { Observable, map, of } from 'rxjs';
import { NgbdSortableHeader, SortEvent } from './sortable.directive';
import { User } from 'src/app/models/user';
import { usersService } from './users.service';
import { ModalComponent } from '../modal/modal.component';
import { MatDialog } from '@angular/material/dialog';
import { AddComponent } from '../add/add.component';
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

	constructor(
		public service: usersService,
		public dialog: MatDialog,
	) {
	}
	ngOnInit(): void{
		this.getData();

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
	openDialog(user:User): void {
		let dialogRef = this.dialog.open(ModalComponent, {
			data: user,
			width: '80%',
			height: '80%',
			autoFocus: false
		});
		dialogRef.afterClosed().subscribe(result => {
			this.service.refreshData();
			this.getData();
		});
	}
	getData() {
		this.users$ = this.service.users$;
		this.total$ = this.service.total$;
		this.hasData$ = this.users$.pipe(map(users => users.length > 0));
	}
}