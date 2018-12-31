import { Component, OnInit } from '@angular/core';
import { EmpserviceService } from '../../services/empservice.service';
import { Emp } from '../../models/emp';


@Component({
  selector: 'app-emplist',
  templateUrl: './emplist.component.html',
  styleUrls: ['./emplist.component.css']
})
export class EmplistComponent implements OnInit {
  empList: Emp[];
  constructor(private httpclientservice : EmpserviceService) { }

  ngOnInit() {
    this.getEmpList();
  }

  getEmpList(){
    return this.httpclientservice.getEmployeeList().subscribe(empList => { this.empList = <Emp[]> empList;})
  }

  getdata(){
    console.log(this.empList);
  }
}
