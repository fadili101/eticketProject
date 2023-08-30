import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from './../../environments/environment';
import { Observable } from 'rxjs';


@Injectable({
	providedIn: 'root'
  })
export class artService{
	URL: string;
	constructor( private http: HttpClient ) {
		this.URL = environment.apiURL;
	}
	getArts():Observable<any> {
		return this.http.get(this.URL + 'arts')
	}
	getData():Observable<any> {
		return this.http.get(this.URL + 'arts')
	}
	getArt(id:Number): Observable<any>{
		return this.http.get(this.URL + 'arts/' + id);
	}
	addArts(form: any): Observable<any>{
		return this.http.post(this.URL + 'arts', form);
	}
}