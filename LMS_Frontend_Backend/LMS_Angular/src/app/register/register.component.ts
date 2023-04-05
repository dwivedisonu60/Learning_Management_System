import { Component , OnInit } from '@angular/core';
import { AuthService } from '../_services/auth.service';
import { HttpParams } from '@angular/common/http';
import { Router, ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})



export class RegisterComponent implements OnInit {

 

  form : any ={
    username : null,
    password : null,
    email : null,
    role : null,
  };

  role = "Mentee"
   
  userRoles= [
      {id :'1', value :"Mentee"},
      {id : '2', value :"Mentor"},
      {id : '3', value :"Admin"}]

  isSuccessfull = false;
  isSignUpFailed = false;
  errorMessage = '';

  constructor ( private authservice : AuthService, private router : Router) {}

   ngOnInit(): void {
  }

  OnSubmit() : void {
    
    console.log(this.form);
    let username = this.form.username
    let password = this.form.password;
    let email = this.form.email;
    let role = this.form.role;
  
    this.authservice.register(username, password , email, role).subscribe(
     
      res => {
        console.log(res);
        this.isSuccessfull = true;
        this.isSignUpFailed = false;

        this.router.navigate(['/login'])

      },
      err => {
       console.log(err.error.message)
       this.errorMessage = err.error.message;
       this.isSignUpFailed = true;

      }
    );


  }

}
