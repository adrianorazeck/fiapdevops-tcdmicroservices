package edu.fiapdevops.tcdmicroservices.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.fiapdevops.tcdmicroservices.model.Entrega;

@FeignClient("entregaservice")
public interface EntregaFeignClient {
	@RequestMapping(method = RequestMethod.GET, value = "/v1/api/entrega/uf/{uf}", consumes = "application/json")
	Entrega getEntrega(@PathVariable("uf") String uf);
}
