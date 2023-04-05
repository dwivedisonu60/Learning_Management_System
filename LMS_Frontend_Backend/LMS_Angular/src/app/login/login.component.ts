import { Component, OnInit } from '@angular/core';
import { AuthService } from '../_services/auth.service';
import { HttpParams } from '@angular/common/http';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})



export class LoginComponent implements OnInit {
  form: any = {
    username: null,
    password: null
  };
  isLoggedIn = false;
  isLoginFailed = false;
  errorMessage = '';
  roles: string[] = [];
  userrole :any;

  constructor(private authService: AuthService,private router : Router) { }

  ngOnInit(): void {
   
  }

  onSubmit(): void {
         
       let username = this.form.username;
       let password = this.form.password;
       
       

    this.authService.login(username,password).subscribe(
      res => {
       
       this.isLoggedIn = true;
       this.userrole = res.role;
       console.log(this.userrole);
       sessionStorage.clear();
       sessionStorage.setItem('Role',this.userrole);
       sessionStorage.setItem('UserName',username);

       if(this.userrole=="Admin")
       {this.router.navigate(['/admin']);}
       else if(this.userrole=="Mentor")
       {
         this.router.navigate(['/mentor']);
       }
        
       else if(this.userrole=="Mentee")
       {
          this.router.navigate(['/mentee']);
       }

         });
  }

  reloadPage(): void {
    window.location.reload();
  }
}
