import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-createemployee',
  templateUrl: './createemployee.component.html',
  styleUrls: ['./createemployee.component.css']
})
export class CreateemployeeComponent implements OnInit {
  varbind="default"

  constructor() { }

  ngOnInit() {
  }
  UserFunction(frm:NgForm): void{
    console.log(frm.value)

  }

}
