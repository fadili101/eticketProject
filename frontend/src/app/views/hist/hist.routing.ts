import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HistListComponent } from './hist-list/hist-list.component';

const routes: Routes = [
  {
    path: 'Hist',
    redirectTo: 'list',
    pathMatch: 'full',
  },
  {
    path: 'list',
    component: HistListComponent,
    data: {
      title: 'Hist List',
    },
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HistRoutingModule { }
