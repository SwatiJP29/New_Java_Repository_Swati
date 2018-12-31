import { NgModule, Component } from '@angular/core';
import { HomeComponent } from './components/home/home.component';
import { EmplistComponent } from './components/emplist/emplist.component';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'emplist',component:EmplistComponent},
  {path:'',component:HomeComponent}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
