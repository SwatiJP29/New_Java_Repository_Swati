import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeInfoComponent } from './employee-info/employee-info.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { EmplistservcomComponent } from './emplistservcom/emplistservcom.component';
import { CreateemployeeComponent } from './createemployee/createemployee.component';
import { HttpServicecallComponent } from './http-servicecall/http-servicecall.component';

const routes: Routes = [
  {path:'home', component:HomeComponent},
  {path: 'employeeslist', component:EmployeeComponent},
  {path: 'employees', component:EmployeeInfoComponent},
  {path: 'employeeServiceList', component:EmplistservcomComponent},
  {path: 'createEmployee', component:CreateemployeeComponent},
  {path: 'serviceCall', component:HttpServicecallComponent},
  {path:'', redirectTo:'/home', pathMatch:'full'},
  {path:'**', component:PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
