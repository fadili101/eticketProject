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
      }
    ]
  },

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
