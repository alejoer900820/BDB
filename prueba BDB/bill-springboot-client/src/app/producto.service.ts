import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductoService {

  private baseURL = 'http://localhost:8080/productrest/products';

  constructor(private http: HttpClient) { }

  getProducto(): Observable<any> {

    return this.http.get(`${this.baseURL}`);

  }

}
