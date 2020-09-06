import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { ProductoService } from "../producto.service"
import { Producto } from "../producto";
import { Router } from '@angular/router'

@Component({
  selector: 'app-producto-list',
  templateUrl: './producto-list.component.html',
  styleUrls: ['./producto-list.component.css']
})
export class ProductoListComponent implements OnInit {

  productos: Observable<Producto[]>;

  constructor(private productoService: ProductoService, private router: Router) { }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {

    this.productos = this.productoService.getProducto();

  }


}
