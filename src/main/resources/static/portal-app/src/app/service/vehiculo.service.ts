import { Vehiculo } from '../model/car.model';
import { environment } from 'src/environments/environment';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, RequestOptions} from '@angular/common/http';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class VehiculoService {

  options: RequestOptions;

  constructor(private http:HttpClient) {}

  getVehiculos(){
    let resource = "/api/getVehiculos";
    return this.http.get<Vehiculo[]>(environment.serverUrl.concat(resource));
  }

  existVehiculo(code: any): Observable<any>{
    let resource = `/api/exist/${code}`;
    console.log(environment.serverUrl.concat(resource));
    return this.http.get(environment.serverUrl.concat(resource));
  }

  getMarcas(){
    
  }
}
