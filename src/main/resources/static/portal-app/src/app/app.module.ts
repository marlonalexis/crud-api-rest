import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {TableModule} from 'primeng/table';
import { AccordionModule } from 'primeng/primeng';
import { PanelModule } from 'primeng/primeng';
import { ButtonModule } from 'primeng/primeng';
import { RadioButtonModule, SelectItem, ButtonModule, MessagesModule, DropdownModule } from 'primeng/primeng';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { VehiculoService } from './service/vehiculo.service';
import { VehiculoDetailComponent } from './vehiculo/vehiculo-detail/vehiculo-detail.component';
import { VehiculoNewComponent } from './vehiculo/vehiculo-new/vehiculo-new.component';
import { VehiculoEditComponent } from './vehiculo/vehiculo-edit/vehiculo-edit.component';
import { VehiculoComponent } from './vehiculo/vehiculo.component';

@NgModule({
  declarations: [
    AppComponent,
    VehiculoDetailComponent,
    VehiculoNewComponent,
    VehiculoEditComponent,
    VehiculoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    TableModule,
    BrowserAnimationsModule,
    FormsModule,
    AccordionModule,
    PanelModule,
    ButtonModule,
    RadioButtonModule,
    HttpClientModule,
    MessagesModule,
    DropdownModule
  ],
  providers: [VehiculoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
