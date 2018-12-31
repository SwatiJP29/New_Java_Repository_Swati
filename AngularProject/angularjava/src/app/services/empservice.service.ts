import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmpserviceService {

  constructor(private http: HttpClient) { }

  getEmployeeList(){
    return this.http.get('http://localhost:8080/Spring_300_MvcJpaRestNg/hr/empList');
  }
}
