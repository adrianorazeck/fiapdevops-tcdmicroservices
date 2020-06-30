package edu.fiapdevops.tcdmicroservices.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.fiapdevops.tcdmicroservices.model.Entrega;
import edu.fiapdevops.tcdmicroservices.service.EntregaService;

@RestController
@RequestMapping(value = "v1/entrega")
public class EntregaServiceController {
	@Autowired
	private EntregaService entregaSLAService;

	@Autowired
	private HttpServletRequest request;

	private static final Logger logger = LoggerFactory.getLogger(EntregaServiceController.class);

	@GetMapping(value = "/")
	public Iterable<Entrega> all (){
		return entregaSLAService.getAllEntregaSLA();
	}
	
	@RequestMapping(value = "/{id}/",method=RequestMethod.GET)
	public Entrega findByEntregaId (@PathVariable String id){
		return entregaSLAService.getEntregaById(id);
	}
	
	@RequestMapping(value = "/{uf}/", method = RequestMethod.GET)
	public Entrega getSLAByUF(@PathVariable("uf") String uf) {
		logger.debug("Found tmx-correlation-id in entregaSLA-service-controller: {} ",
				request.getHeader("tmx-correlation-id"));
		return entregaSLAService.getSLAByUF(uf);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public void updateLicenses(@PathVariable("id") String id, @RequestBody Entrega entrega) {
		entregaSLAService.updateEntregaSLA(entrega);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void saveLicenses(@RequestBody Entrega entrega) {
		entregaSLAService.saveEntregaSLA(entrega);
	}

	@RequestMapping(value = "{entregaId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteLicenses(@PathVariable("entregaId") String entregaId, @RequestBody Entrega entrega) {
		entregaSLAService.deleteEntregaSLA(entrega);
	}
}
