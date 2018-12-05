package com.crud.resource;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.pattern.IntegerPatternConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	//@RequestMapping(path = "/getVehiculos", method = RequestMethod.GET, consumes = {
      //      MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8"}, produces = {MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8"})
	@GetMapping("/getVehiculos")
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
	
	@RequestMapping(path="/exist/{id}"
    		, method = RequestMethod.GET
    		, produces = {MediaType.APPLICATION_JSON_VALUE})
	public Integer exist(@PathVariable("id") String code) {
		Integer sc = null;
		try {
			Boolean val = vehiculoService.exist(Long.parseLong(code));
			if (val) {
				sc = 1;
			}else {
				sc = 0;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return sc;
	}
}
