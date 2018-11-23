import { Component, OnInit } from '@angular/core';
import { Employee, EmployeeType } from '../model/model';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  name: string="Employee Information";
  row1:string="First Name";
  row2: string="Last Name";
  row3: string="Gender";
  row4: string="Age";
  firstname: string="Swati";
  lastname: string="Deshpande";
  Gender: string="Female";
  Age: number=30;
  Duration: number = 30;

  showFaculty: boolean = true;
  Faculty: string = "Swati Deshpande"
  Subjects : string[] = ["Java","ASP.NET", "Sharpoint"]
  Employees : any[] = [
    {Code: "emp101", Name:"Swati",Gender: "Female",AnnualSalary:5500, DateofBirth: '2/6/1985'
    },

    {Code: "emp102", Name:"Neha", Gender: "Female", AnnualSalary: 5600, DateofBirth: '5/6/1986'
    },
    {Code: "emp103", Name: "Arpita",Gender: "Female", AnnualSalary: 5800, DateofBirth: '5/7/1985'
    }
  ];
  emp : Employee = new Employee (1, "Swati", 5000, EmployeeType.Permanent);
  


  constructor() { }

  ngOnInit() {
  }

   displayFullName():string{
    return "Full Name = "+" "+this.firstname+" "+this.lastname;
  }

}
