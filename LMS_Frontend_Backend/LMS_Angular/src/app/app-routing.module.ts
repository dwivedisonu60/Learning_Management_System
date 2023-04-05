import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';
import { LMSAdminComponent } from './lms-admin/lms-admin.component';
import { LMSMentorComponent } from './lms-mentor/lms-mentor.component';
import { LMSMenteeComponent } from './lms-mentee/lms-mentee.component';



const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'mentee', component: LMSMenteeComponent },
  { path: 'mentor', component: LMSMentorComponent },
  { path: 'admin', component: LMSAdminComponent },
  { path: 'welcome', component: WelcomePageComponent },
  { path: '', redirectTo: 'welcome', pathMatch: 'full' }
];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
