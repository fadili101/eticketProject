import { Component } from '@angular/core';

export const ROUTES = [
  {
    path: 'user',
    title: 'Utilisateurs',
    icon: 'fas fa-user me-2',
    children: [
      { path: 'list', title: 'All Users' }, // This corresponds to /dashboard/user/get
      { path: 'add', title: 'Create User' }, // This corresponds to /dashboard/user/add
    ]
  },
  // {
  //   path: 'Departement',
  //   title: 'Departement',
  //   icon: 'fas fa-th-large me-2',
  //   children: [
  //     { path: 'list', title: 'Liste Des Departements'},
  //     // { path: 'add', title: 'Create Departement'},
  //   ]
  // },
  {
    path: 'Profile',
    title: 'Profile',
    icon: 'fas fa-th-large me-2',
    children: [
      { path: 'list', title: 'Liste Des Profiles'},
      { path: 'add', title: 'Creer Un Profile'},
    ]
  },
  {
    path: 'Caisse',
    title: 'Caisse',
    icon: 'fas fa-th-large me-2',
    children: [
      { path: 'list', title: 'Liste Des Profiles'}
    ]
  },
  {
    path: 'Workflow',
    title: 'Workflow',
    icon: 'fas fa-th-large me-2',
    children: [
      { path: 'list', title: 'Liste Des Workflow'}
    ]
  },
  {
    path: 'Art',
    title: 'Art',
    icon: 'fas fa-th-large me-2',
    children: [
      { path: 'list', title: 'Liste Des Articles'}
    ]
  },
  {
    path: 'Hist',
    title: 'Hist',
    icon: 'fas fa-th-large me-2',
    children: [
      { path: 'list', title: 'Liste Des Hist'}
    ]
  },
  {
    path: 'Clavier',
    title: 'Clavier',
    icon: 'fas fa-th-large me-2',
    children: [
      { path: 'list', title: 'Liste Des Claviers'}
    ]
  },
];


@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})

export class SidebarComponent {
  menuItems!: any[];

  constructor() { }

  ngOnInit() {
    this.menuItems = ROUTES.filter(menuItem => menuItem);
  }
}
