import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddComponent } from './add/add.component';
import { GetComponent } from './get/get.component';
import { ModalComponent } from './modal/modal.component';
import { UserRoutingModule } from './user-routing.module';



@NgModule({
  declarations: [
    AddComponent,
    GetComponent,
    ModalComponent
  ],
  imports: [
    CommonModule,
    UserRoutingModule
  ]
})
export class UserModule { }
