import { Component, OnInit } from '@angular/core';
import {ConfirmationService, Message, SelectItem} from "primeng/api";
import { Vehiculo } from './model/car.model';
import { Marca } from './model/marca.model';
import {Router, ActivatedRoute} from "@angular/router";
import { VehiculoService } from '../../service/vehiculo.service';
import {DropdownModule} from 'primeng/dropdown';

@Component({
  selector: 'app-vehiculo-detail',
  templateUrl: './vehiculo-detail.component.html',
  styleUrls: ['./vehiculo-detail.component.css']
})
export class VehiculoDetailComponent implements OnInit {

  msgs: Message [] = [];
  vehiculo  = {} as Vehiculo;
  newVehiculo: boolean = false
  codeCount: number;
  originalCode: string;
  pattern = {} as any;
  id: any;
  medioAccesoOptions: Marca[];
  selectedSuscriber: Marca;

  constructor(public router: Router,
  private route: ActivatedRoute,
  private vehiculoService: VehiculoService) { }

  ngOnInit() {
    this.codeCount = 0;

    this.pattern = {
      namePattern: "^[\\w\\W\\s]{1,200}$",
      codePattern: "^[\\w]{1,50}$",
      descriptionPattern: "^[\\w\\W\\s]{0,250}$",
      id: "^[0-9]{6}$"
    }
    this.route.params.subscribe(params => {
      this.id = +params['code'];
    });

    if (this.id != 0) {
    }else{
      console.log("Es nuevo");
    }
  }

  validate(){
  if(this.originalCode === this.vehiculo.id || this.vehiculo.id == ""){
    this.codeCount = 0;
  }else{
    this.vehiculoService.existVehiculo(this.vehiculo.id).subscribe(
        exist => {
          console.log(exist);
          if (exist == 1) {
              this.codeCount = 1;
          }else{
            this.codeCount = 0;
          }
        }
      )
  }
}

}
