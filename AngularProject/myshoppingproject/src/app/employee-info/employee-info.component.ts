import { Component, OnInit } from '@angular/core';
import { emp } from '../model/emp';

@Component({
  selector: 'app-employee-info',
  templateUrl: './employee-info.component.html',
  styleUrls: ['./employee-info.component.css']
})
export class EmployeeInfoComponent implements OnInit {
  Profiles : emp[] = [
    {
      id : 1,
      name : 'Swati',
      gender: 'Female',
      contactPreference: 'Email',
      email: 'abc@yahoo.com',
      dateOfBirth: new Date('10/25/1988'),
      department: 'IT',
      isActive: true,
      photoPath: 'assets/images/anu.png'
    },
    {
      id : 2,
      name : 'Neha',
      gender: 'Female',
      contactPreference: 'Phone',
      phonenumber: 1234567899,
      dateOfBirth: new Date('11/20/1988'),
      department: 'HR',
      isActive: true,
      photoPath: 'assets/images/parth.png'
    },
    {
      id : 3,
      name : 'Anil',
      gender: 'Male',
      contactPreference: 'Phone',
      phonenumber: 2343454567,
      dateOfBirth: new Date('12/25/1988'),
      department: 'HR',
      isActive: true,
      photoPath: 'assets/images/rash.png'
    },
    ];

  constructor() { }

  ngOnInit() {
  }


}
