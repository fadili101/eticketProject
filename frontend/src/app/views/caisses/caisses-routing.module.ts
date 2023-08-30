import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CaisseListComponent } from './caisse-list/caisse-list.component';

const routes: Routes = [
  {
    path: 'Profile',
    redirectTo: 'list',
    pathMatch: 'full',
  },
  {
    path: 'list',
    component: CaisseListComponent,
    data: {
      title: 'Profile List',
    },
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CaissesRoutingModule { }
