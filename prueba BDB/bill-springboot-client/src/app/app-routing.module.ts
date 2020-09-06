import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductoListComponent } from './producto-list/producto-list.component'

const routes: Routes = [
  { path: '', redirectTo: 'producto', pathMatch: 'full' },
  { path: 'productos', component: ProductoListComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
