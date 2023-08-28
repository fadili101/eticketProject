import { Component, QueryList, ViewChildren } from '@angular/core';
import { Departement } from 'src/app/models/departement';
import { DepeartementNgbdSortableHeader, SortEvent } from './DepartementSortable.directive';
import { Observable, map } from 'rxjs';
import { MatDialog } from '@angular/material/dialog';
import { ModalComponent } from '../modal/modal.component';
import { DecimalPipe } from '@angular/common';
import { DepartementsService } from './departements.service';

@Component({
  selector: 'departement-list',
  templateUrl: './Departement.component.html',
  styleUrls: ['./Departement.component.css'],
  providers: [DepartementsService, DecimalPipe]
})
export class DepartementList {
  departements$!: Observable<Departement[]>;
	total$!: Observable<number>;
	hasData$!: Observable<boolean>;

	@ViewChildren(DepeartementNgbdSortableHeader)
  	headers!: QueryList<DepeartementNgbdSortableHeader>;

	constructor(
		public service: DepartementsService,
		public dialog: MatDialog,
	) {
	}
	ngOnInit(): void{
		this.getData();
		console.log(this.departements$)

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
	openDialog(departement:Departement): void {
		let dialogRef = this.dialog.open(ModalComponent, {
			data: departement,
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
		this.departements$ = this.service.departements$;
		this.total$ = this.service.total$;
		this.hasData$ = this.departements$.pipe(map(departements => departements.length > 0));
	}
}
