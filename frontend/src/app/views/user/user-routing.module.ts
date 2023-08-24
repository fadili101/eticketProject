import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './add/add.component';
import { GetComponent } from './get/get.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: 'get', component: GetComponent },
      { path: 'add', component: AddComponent },
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UserRoutingModule { }
