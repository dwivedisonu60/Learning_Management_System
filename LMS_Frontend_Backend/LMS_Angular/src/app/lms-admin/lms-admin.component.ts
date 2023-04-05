import { Component,OnInit } from '@angular/core';
import {MatTableModule} from '@angular/material/table'
import { HttpClient, HttpHeaders,HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-lms-admin',
  templateUrl: './lms-admin.component.html',
  styleUrls: ['./lms-admin.component.css']
})
export class LMSAdminComponent implements OnInit {


MentorData : any =[];
MenteeData : any =[];

constructor (private http : HttpClient) {}

  ngOnInit(): void {
     
 
     this.fetchMentorDetails();
    
     this.fetchMenteeDetails();

  }

  fetchMentorDetails(){
     const headers = { 'content-type':'application/json', 'Access-Control-Allow-Origin': '*' }
     this.http.get('http://localhost:8080/fetch/Mentor', { headers }).subscribe(data => {
        this.MentorData=data;
    })

   }

    fetchMenteeDetails(){
     const headers = { 'content-type':'application/json', 'Access-Control-Allow-Origin': '*' }
     this.http.get('http://localhost:8080/fetch/Mentee', { headers }).subscribe(data => {
        this.MenteeData=data;
    })

   }

}
