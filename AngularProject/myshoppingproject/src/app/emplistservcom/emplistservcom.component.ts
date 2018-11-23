import { Component, OnInit } from '@angular/core';
import { EmpdataService } from '../services/empdata.service';

@Component({
  selector: 'app-emplistservcom',
  templateUrl: './emplistservcom.component.html',
  styleUrls: ['./emplistservcom.component.css']
})
export class EmplistservcomComponent implements OnInit {
  employees: any[];

  constructor(private _employeeService: EmpdataService) { }

  ngOnInit() {
    this.employees=this._employeeService.getEmployees();
  }

}
