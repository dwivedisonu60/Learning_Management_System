import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const API_URL =''

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(http : HttpClient) { }

  getPublicContent() : Observable<any> {
    return this.http.post(API_URL + 'forAll',{
      responseType : 'text'
    })
  }

  getMentorContent() : Observable<any> {
    return this.http.post(API_URL + 'mentor',{
      responseType : 'text'
    })
  }

  getMenteeContent() : Observable<any> {
    return this.http.post(API_URL + 'mentee',{
      responseType : 'text'
    })
  }
  getAdminContent() : Observable<any> {
    return this.http.post(API_URL + 'admin',{
      responseType : 'text'
    })
  }




}
