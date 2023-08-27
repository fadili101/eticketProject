import { Component} from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Caisse } from 'src/app/models/caisse';
import { Departement } from 'src/app/models/departement';
import { Profil } from 'src/app/models/profil';
import { User } from 'src/app/models/user';
import { caisseService } from 'src/app/services/caisse.service';
import { departementService } from 'src/app/services/departement.service';
import { profileService } from 'src/app/services/profile.service';
import { UserService } from 'src/app/services/user.service';
import { ModalComponent } from '../modal/modal.component';


@Component({
	selector: 'app-add',
	templateUrl: './add.component.html',
	styleUrls: ['./add.component.css']
})
export class AddComponent{
	users: User[] = [];
	user!: User;
	profiles: Profil[] = [];
	departements: Departement[] = [];
	Caisses: Caisse[] = [];
	userForm: FormGroup;

	constructor(private userService: UserService,
		private caisseService: caisseService,
		private profileService: profileService,
		private departementService: departementService,
		public dialog: MatDialog,
		public _snackBar: MatSnackBar,
		private formBuilder: FormBuilder,
	) {
		this.userForm = this.formBuilder.group({
			prenom: '',
			nom: '',
			login: '',
			password: '',
			Co_NO: '',
			DocPermissions: '',
			editPass: '',
			actif: '',
			prls: '',
			dprts: '',
			cai: [],
		  });
	}
	ngOnInit(){
		this.userService.getUsers().subscribe(
			data => {
				this.users = data;
			}
		);
		this.caisseService.getCaisses().subscribe(
			data => {
				this.Caisses = data;
			}
		)
		this.profileService.getProfiles().subscribe(
			data => {
				this.profiles = data;
			}
		)
		this.departementService.getDepartements().subscribe(
			data => {
				this.departements = data;
			}
		)
	}
	onSubmit()
	{
		// this.userService.getUser(this.id).subscribe(
		// 	data => {
		// 		this.user = data;
		// 	}
		// )
	}
	onAdd(formValue: any) {
		const transformedData = this.transformFormData(formValue);
		console.log(transformedData)
		this.userService.addUser(transformedData).subscribe(
			data => {
				this.openSnackBar("Created Successfully", "cancel")
			}
		)
	}
	openSnackBar(message: string, action: string) {
		this._snackBar.open(message, action);
	  }
	transformFormData(formData: any): any {
		return {
		  prenomUser: formData.prenom,
		  nomUser: formData.nom,
		  login: formData.login,
		  motPasse: formData.password,
		  co_NO: formData.Co_NO,
		  toutDocument: formData.DocPermissions === 'oui' ? false : true,
		  updatePassword: formData.editPass === 'oui' ? true : false,
		  profil: { profilId: formData.prls },
		  departement: { departementId: formData.dprts },
		  assignedCaisses: formData.cai.map((caisseId: number) => ({ caisseId })),
		  actif: formData.actif === 'oui' ? true : false // Transform actif
		};
	}

	openDialog(user:User): void {
		let dialogRef = this.dialog.open(ModalComponent, {
			data: user,
			width: '80%',
			height: '80%',
			autoFocus: false
		});
		dialogRef.afterClosed().subscribe(result => {
			console.log('Dialog closed:', result);
		});
	}
}


