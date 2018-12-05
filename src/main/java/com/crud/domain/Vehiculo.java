package com.crud.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "vehiculo")
public class Vehiculo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	/*@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="marca")
	private Marca marca;*/
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="marca")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Marca marca;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "anion")
	private Integer anio;
	
	@Column(name = "precio")
	private Double precio;
	
	@Column(nullable = false, updatable = false, name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
	private Date fecha_creacion;
	
	@Column(name = "estado")
	private String estado;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio="
				+ precio + ", fecha_creacion=" + fecha_creacion + ", estado=" + estado + "]";
	}

/*	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio
				+ ", fecha_creacion=" + fecha_creacion + ", estado=" + estado + "]";
	}*/
	
	

	
}
