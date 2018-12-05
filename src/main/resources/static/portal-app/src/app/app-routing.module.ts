import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { VehiculoDetailComponent } from './vehiculo/vehiculo-detail/vehiculo-detail.component';
import { VehiculoComponent } from './vehiculo/vehiculo.component';

const routes: Routes = [
  {
    path: '', component: VehiculoComponent
    //,canActivate: [AppAuthGuard]
  },
  {
    path: 'vehiculo-detail/:code', component: VehiculoDetailComponent
    //,canActivate: [AppAuthGuard]
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
