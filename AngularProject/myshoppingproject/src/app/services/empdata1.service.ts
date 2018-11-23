import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Item } from '../model/item';
//import { HttpClient } from 'selenium-webdriver/http';

@Injectable({
  providedIn: 'root'
})
export class Empdata1Service {
  
  constructor(private http:HttpClient){}

  getEmployees1(){
    return this.http.get('http://localhost:3000/items');
  }

  additemlist(newitem: Item){
    return this.http.post('http://localhost:3000/items', newitem)
  }
  edititemlist(newitem: Item){
    return this.http.put('http://localhost:3000/items', newitem)
  }
}
