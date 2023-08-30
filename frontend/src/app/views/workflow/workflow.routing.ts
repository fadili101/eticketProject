import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { WorkflowListComponent } from './workflow-list/workflow-list.component';

const routes: Routes = [
  {
    path: 'Workflow',
    redirectTo: 'list',
    pathMatch: 'full',
  },
  {
    path: 'list',
    component: WorkflowListComponent,
    data: {
      title: 'Profile List',
    },
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class WorkflowRoutingModule { }
