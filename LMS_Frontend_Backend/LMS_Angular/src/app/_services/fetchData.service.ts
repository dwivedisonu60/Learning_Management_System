import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders,HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

const fetchData =''


@Injectable({
  providedIn: 'root'
})

export class fetchDataService {

  


  constructor(private http : HttpClient) { }

   

    fetchMentor( body :any ) : Observable <any>  {
        let headers = new HttpHeaders();
        headers=headers.set('content-type','application/json');
        headers=headers.set('Access-Control-Allow-Origin', '*');
        

       

    return this.http.get(fetchData + 'mentor', { 'headers': headers })
  }
}
