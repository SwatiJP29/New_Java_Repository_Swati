import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { EmployeeComponent } from './employee/employee.component';
import { ContactusComponent } from './contactus/contactus.component';
import { EmpPipe } from './pipes/emp.pipe';
import { EmployeeInfoComponent } from './employee-info/employee-info.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { Routes, RouterModule } from '@angular/router';
import { EmplistservcomComponent } from './emplistservcom/emplistservcom.component';
import { CreateemployeeComponent } from './createemployee/createemployee.component';
import {FormsModule} from '@angular/forms';
import { HttpServicecallComponent } from './http-servicecall/http-servicecall.component';
import { HttpClientModule } from '@angular/common/http'


const appRoutes:Routes = [
  {path:'home', component:HomeComponent},
  {path: 'employeeslist', component:EmployeeComponent},
  {path: 'employees', component:EmplistservcomComponent},
  {path:'', redirectTo:'/home', pathMatch:'full'},
  {path:'**', component:PageNotFoundComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    EmployeeComponent,
    ContactusComponent,
    EmpPipe,
    EmployeeInfoComponent,
    PageNotFoundComponent,
    EmplistservcomComponent,
    CreateemployeeComponent,
    HttpServicecallComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule, 
    RouterModule.forRoot(appRoutes),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
