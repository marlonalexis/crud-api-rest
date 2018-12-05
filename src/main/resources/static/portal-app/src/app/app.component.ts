import { Component, OnInit } from '@angular/core';
import { Vehiculo } from './model/car.model';
import { Marca } from './model/marca.model';
import { VehiculoService } from './service/vehiculo.service';
import {ConfirmationService, LazyLoadEvent, Message, SelectItem} from "primeng/api";
import {ButtonModule} from 'primeng/button';
import {Router} from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'portal-app';

  constructor(private vehiculoService: VehiculoService,
  public router: Router) {

  }
  ngOnInit() {

  }


}
