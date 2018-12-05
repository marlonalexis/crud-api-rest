import { Component, OnInit } from '@angular/core';
import { Vehiculo } from '../model/car.model';
import { Marca } from '../model/marca.model';
import { VehiculoService } from '../service/vehiculo.service';
import { Router } from '@angular/router';
import { SelectItem } from 'primeng/api';

@Component({
  selector: 'app-vehiculo',
  templateUrl: './vehiculo.component.html',
  styleUrls: ['./vehiculo.component.css']
})
export class VehiculoComponent implements OnInit {

  cols: any[];

  vehiculos: Vehiculo[];

  marca: Marca[];

  statusOptions: SelectItem [];

  constructor(private vehiculoService: VehiculoService,
  public router: Router) {

  }
  ngOnInit() {

    this.statusOptions = [ 
      {label: 'Activo', value: 'A'},
      {label: 'Inactivo', value: 'I'},
    ];

    this.cols = [
            { field: 'id', header: 'Id' },
            { field: 'modelo', header: 'Modelo' },
            { field: 'marca', header: 'Marca' }
        ];

        this.vehiculoService.getVehiculos()
              .subscribe( data => {
                //console.log(data.response);
                this.vehiculos = data.response;
                 console.log(this.vehiculos);
              });
  }

  getStatusName(value: string): string {
    return this.statusOptions.find(x => x.value == value).label;
  }

  editar(vehiculo: Vehiculo){
    alert(vehiculo.modelo);
  }

  eliminar(vehiculo: Vehiculo){
    alert(vehiculo.marca.nombre);
  }

  agregar(){
  this.router.navigate(['/vehiculo-detail', 0]);
  }

}
