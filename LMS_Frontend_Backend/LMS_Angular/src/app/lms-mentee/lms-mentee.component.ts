import { Component,OnInit } from '@angular/core';
import {MatTableModule} from '@angular/material/table'
import { HttpClient, HttpHeaders,HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-lms-mentee',
  templateUrl: './lms-mentee.component.html',
  styleUrls: ['./lms-mentee.component.css']
})
export class LMSMenteeComponent implements OnInit{


showDashBoardContent: Boolean = true;
showRegisterContent : Boolean = false;
MentorData : any =[];
COURSELIST : any =[];
username = sessionStorage.getItem('UserName') || "";

selectedQuantity="Select a Value";
isRegistration = false;


constructor (private http : HttpClient) {}

   ngOnInit(): void {
     
     this.getSubjects();
     this.fetchDetails();

  }
   ShowDashBoardButton() {
      this.showDashBoardContent = true;
      this.showRegisterContent = false;

   }
   ShowRegisterButton() {
      this.showDashBoardContent = false;
      this.showRegisterContent = true;

   }

   

   fetchDetails(){
     const headers = { 'content-type':'application/json', 'Access-Control-Allow-Origin': '*' }
     this.http.get('http://localhost:8080/fetch/Mentor', { headers }).subscribe(data => {
        this.MentorData=data;
    })

   }

   fetchSubjects( username : string) :Observable <any>{
     const headers = { 'content-type':'application/json', 'Access-Control-Allow-Origin': '*' }
     return this.http.post('http://localhost:8080/getSubject/Mentee',{username} ,{ headers })
     }

  getSubjects(){

     this.fetchSubjects(this.username).subscribe(res=>{
       console.log(res);
       this.COURSELIST = res;
     }

     )
  }

  RegisterMentee(){
  let coursename = this.selectedQuantity;
  
  this.sendMenteeRegistration(this.username,coursename).subscribe(res=>{
    console.log(res);
    this.isRegistration = res;

  })

  }

  sendMenteeRegistration(username : string , coursename : string) : Observable <any> {
     const headers = { 'content-type':'application/json', 'Access-Control-Allow-Origin': '*' }
  return this.http.post('http://localhost:8080/registration/mentee', {username,coursename}, { headers })

  }



}
