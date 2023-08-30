import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ArtListComponent } from './art-list/art-list.component';

const routes: Routes = [
  {
    path: 'Art',
    redirectTo: 'list',
    pathMatch: 'full',
  },
  {
    path: 'list',
    component: ArtListComponent,
    data: {
      title: 'Profile List',
    },
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ArtRoutingModule { }
