import { Component, OnInit } from '@angular/core';
import {Product} from '../model/product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  selectedProduct : Product[];
  Products : Product[] = [
    {
      productid : 1,
      productname : "Samsung J7 prime",
      productprice : 25000.00,
      productimgsrc : 'assets/images/samsungj7prime.png'
    },
    {
      productid : 2,
      productname : "Samsung J7",
      productprice : 18000.00,
      productimgsrc : 'assets/images/samsungj7.png'
    },
    {
      productid : 3,
      productname : "Oppo",
      productprice : 180000.00,
      productimgsrc : 'assets/images/oppo.png'
    },
    {
      productid : 4,
      productname : "Nokia",
      productprice : 11000.00,
      productimgsrc : 'assets/images/nokia.png'
    },
    {
      productid : 5,
      productname : "Redmi",
      productprice : 28000.00,
      productimgsrc : 'assets/images/redmi.png'
    },
    {
      productid : 6,
      productname : "Apple",
      productprice : 68000.00,
      productimgsrc : 'assets/images/appleiphone.png'
    }
  ]

  showSelectedProduct(){
    
    alert(this.selectedProduct);
  }

  constructor() { }

  ngOnInit() {
  }

}
