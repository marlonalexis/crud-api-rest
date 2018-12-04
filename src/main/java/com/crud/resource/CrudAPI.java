package com.crud.resource;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.bean.ListGenericResponse;
import com.crud.domain.Vehiculo;
import com.crud.service.VehiculoService;

@Controller
@RestController
@RequestMapping("/api")
public class CrudAPI {

	@Autowired
	VehiculoService vehiculoService;
	
	private static final Logger log = LogManager.getLogger(CrudAPI.class);
	
	@RequestMapping(path = "/getVehiculos", method = RequestMethod.GET, consumes = {
            MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8"}, produces = {MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8"})
	public ListGenericResponse<Vehiculo> getVehiculos() {
		ListGenericResponse<Vehiculo> response = new ListGenericResponse<>();
		try {
			List<Vehiculo> vehiculo = vehiculoService.getAll();
			response.setCode(0);
			response.setStatus("OK");
			response.setMessage("Ejecucion exitosa");
			response.setResponse(vehiculo);
		} catch (Exception e) {
			log.error("Error al consultar microservicio");
			response.setCode(1);
			response.setStatus("ERROR");
			response.setMessage("Ejecucion fallida");
		}
		return response;
	}
}
