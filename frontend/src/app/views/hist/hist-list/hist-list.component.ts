import { Component, QueryList, ViewChildren } from '@angular/core';
import { HistesService } from './hists.service';
import { DecimalPipe } from '@angular/common';
import { HistGesaur } from 'src/app/models/histgesaur';
import { Observable, map } from 'rxjs';
import { HistsNgbdSortableHeader, SortEvent } from './HistsSortable.directive';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-hist-list',
  templateUrl: './hist-list.component.html',
  styleUrls: ['./hist-list.component.css'],
  providers: [HistesService, DecimalPipe]
})
export class HistListComponent {
  hists$!: Observable<HistGesaur[]>;
	total$!: Observable<number>;
	hasData$!: Observable<boolean>;

	@ViewChildren(HistsNgbdSortableHeader)
  	headers!: QueryList<HistsNgbdSortableHeader>;
    constructor(
      public service: HistesService,
      public dialog: MatDialog,
    ) {
    }
    ngOnInit(): void{
      this.getData();
      console.log(this.hists$)

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
    getData() {
      this.hists$ = this.service.hists$;
      this.total$ = this.service.total$;
      this.hasData$ = this.hists$.pipe(map(hists => hists.length > 0));
    }
}
