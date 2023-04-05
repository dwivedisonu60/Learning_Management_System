import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders,HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

const API2Authenticate ='http://localhost:8080/authenticate/'


@Injectable({
  providedIn: 'root'
})

export class AuthService {

  


  constructor(private http : HttpClient) { }

    login(  username : string , password : any  ) : Observable <any>  {
        let headers = new HttpHeaders();
        headers=headers.set('content-type','application/json');
        headers=headers.set('Access-Control-Allow-Origin', '*');
        

       

    return this.http.post(API2Authenticate + 'login',{username,password} , { 'headers': headers })
  }

  register( username : string , password : any , email : any ,role : any) : Observable <any> {
    
   

      let headers = new HttpHeaders();
      headers=headers.set('content-type','application/json');
      headers=headers.set('Access-Control-Allow-Origin', '*');
     
      

      return this.http.post(API2Authenticate + 'signup',{username,password,email,role} ,{ 'headers': headers })


  }
}
