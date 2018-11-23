import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmpdataService {

  getEmployees(): any[]{
    return[
      {code: 'emp101', name: 'Anil', gender: 'Female', annualSalary:5500, dateOfBirth: '8/6/1985'},
      {code: 'emp102', name: 'Swati', gender: 'Female', annualSalary:5600, dateOfBirth: '9/6/1985'},
      {code: 'emp103', name: 'Neha', gender: 'Female', annualSalary:5800, dateOfBirth: '10/6/1985'},
    ]
  }
}
