import { Marca } from './marca.model';

export interface Vehiculo {
    id?;
    anio?;
    estado?;
    fecha_creacion?;
    marca?:Marca;
    modelo?;
    precio?;
}
