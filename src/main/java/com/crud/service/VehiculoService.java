package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.VehiculoRepository;
import com.crud.domain.Vehiculo;

@Service
public class VehiculoService {

	@Autowired
	VehiculoRepository vehiculoRepository;
	
	public List<Vehiculo> getAll() {
		return vehiculoRepository.findAll();
	}
	
}
