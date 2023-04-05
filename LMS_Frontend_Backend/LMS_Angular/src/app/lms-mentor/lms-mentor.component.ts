import { Component,OnInit } from '@angular/core';
import {MatTableModule} from '@angular/material/table'
import {MenteeTable} from '../models/MenteeTable'
import { HttpClient, HttpHeaders,HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-lms-mentor',
  templateUrl: './lms-mentor.component.html',
  styleUrls: ['./lms-mentor.component.css']
})
export class LMSMentorComponent implements OnInit {

showDashBoardContent: Boolean = true;
showRegisterContent : Boolean = false;
MenteeData : any =[];
COURSELIST : any =[];
username = sessionStorage.getItem('UserName') || "";
isRegistration = false;
selectedQuantity="Select a Value";

constructor (private http : HttpClient) {}

   ngOnInit(): void {
     this.fetchDetails();
     this.getSubjects()


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
     this.http.get('http://localhost:8080/fetch/Mentee', { headers }).subscribe(data => {
        this.MenteeData=data;
    })

   }


   fetchSubjects( username : string) :Observable <any>{
     const headers = { 'content-type':'application/json', 'Access-Control-Allow-Origin': '*' }
     return this.http.post('http://localhost:8080/getSubject/Mentor',{username} ,{ headers })
     }

  getSubjects(){

     this.fetchSubjects(this.username).subscribe(res=>{
       console.log(res);
       this.COURSELIST = res;
     }

     )
  }

  RegisterMentor(){
  let coursename = this.selectedQuantity;
  
  this.sendMentorRegistration(this.username,coursename).subscribe(res=>{
    console.log(res);
    this.isRegistration = res;

  })

  }

  sendMentorRegistration(username : string , coursename : string) : Observable <any> {
     const headers = { 'content-type':'application/json', 'Access-Control-Allow-Origin': '*' }
  return this.http.post('http://localhost:8080/registration/mentor', {username,coursename}, { headers })

  }



}
