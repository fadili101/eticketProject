import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddComponent } from './add/add.component';
import { GetComponent } from './get/get.component';



@NgModule({
  declarations: [
    AddComponent,
    GetComponent
  ],
  imports: [
    CommonModule
  ]
})
export class DepartementModule { }
