import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContainersComponent } from './containers/containers.component';
import { DashboardComponent } from './views/dashboard/dashboard.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '',
    pathMatch: 'full',
  },
  {
    path: '',
    component: ContainersComponent,
    children: [
      {
        path: 'user',
        loadChildren: () => import('./views/user/user.module').then(m => m.UserModule),
      },
      {
        path: 'Departement',
        loadChildren: () => import('./views/departement/departement.module').then(m => m.DepartementModule)
      },
      {
        path: 'Profile',
        loadChildren: () => import('./views/profile/profile.module').then(m => m.ProfileModule)
      },
      {
        path: 'Caisse',
        loadChildren: () => import('./views/caisses/caisses.module').then(m => m.CaissesModule)
      },
      {
        path: 'Workflow',
        loadChildren: () => import('./views/workflow/workflow.module').then(m => m.WorkflowModule)
      },
      {
        path: 'Art',
        loadChildren: () => import('./views/art/art.module').then(m => m.ArtModule)
      },
      {
        path: 'Hist',
        loadChildren: () => import('./views/hist/hist.module').then(m => m.HistModule)
      },
      {
        path: 'Clavier',
        loadChildren: () => import('./views/clavier/clavier.module').then(m => m.ClavierModule)
      }
    ]
  },

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
