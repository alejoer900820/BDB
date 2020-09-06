import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductoListComponent } from './producto-list.component';
import { ProductoService } from '../producto.service';

describe('ProductoListComponent', () => {
  let component: ProductoListComponent;
  let service: ProductoService;


  /*let fixture: ComponentFixture<ProductoListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductoListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductoListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });*/

  describe('ProductoService', () => {
    beforeEach(() => TestBed.configureTestingModule({}));
  
    it('should be created', () => {
      const service: ProductoService = TestBed.get(ProductoService);
      expect(service).toBeTruthy();
    });
  });
  



});
