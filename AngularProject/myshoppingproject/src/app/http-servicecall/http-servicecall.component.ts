import { Component, OnInit } from '@angular/core';
import { Item } from '../model/item';
import { Empdata1Service } from '../services/empdata1.service';

@Component({
  selector: 'app-http-servicecall',
  templateUrl: './http-servicecall.component.html',
  styleUrls: ['./http-servicecall.component.css']
})
export class HttpServicecallComponent implements OnInit {
  cart : Item[];
  toggleForm: boolean = false;
  selectedItem: Item;
  

  constructor(private _httpClientService : Empdata1Service) { }


  ngOnInit() {
    this.getitems();

  }
  getitems()
  {
    this._httpClientService.getEmployees1().subscribe(items=>{
      this.cart = <Item[]> items;
    })

  }
  addItemToJSON(frm){
    let newitem: Item = {
      id: frm.value.id,
      itemname: frm.value.name,
      itemquantity: frm.value.itemnumber,
    }

    this._httpClientService.additemlist(newitem).subscribe (item => {console.log(item);
    this.getitems()
  })}
  editForm(editfrm) {
    let newItem: Item = {
      id: this.selectedItem.id,
      itemname: editfrm.value.name,
      itemquantity: editfrm.value.itemnumber,
      //itemboughts: this.selectedItem.itemboughts
    }
    this._httpClientService.edititemlist(newItem)

      .subscribe(result => {
        console.log('original item to be updated with old values' + result);
        this.getitems();
        this.toggleForm = !this.toggleForm;
      })

  }


  showEditForm(i){
    this.selectedItem=i;
    this.toggleForm=true;
  }


  }


