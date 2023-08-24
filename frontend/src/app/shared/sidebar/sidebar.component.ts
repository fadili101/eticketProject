import { Component } from '@angular/core';

export const ROUTES = [
  {
    path: 'user',
    title: 'Utilisateurs',
    icon: 'fas fa-user me-2',
    children: [
      { path: 'get', title: 'All Users' }, // This corresponds to /dashboard/user/get
      { path: 'add', title: 'Create User' }, // This corresponds to /dashboard/user/add
    ]
  }
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
