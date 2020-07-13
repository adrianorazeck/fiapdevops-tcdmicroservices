package edu.fiapdevops.tcdmicroservices.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import edu.fiapdevops.tcdmicroservices.model.Entrega;

@Service
public class EntregaFeignClientImpl implements EntregaFeignClient{

	@Autowired
	@LoadBalanced
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "defaultEntrega")
	public Entrega getEntrega(String uf) {
		return restTemplate.getForObject("http://entregaservice/v1/api/entrega/uf/{uf}", Entrega.class, uf);
	}

	private Entrega defaultEntrega() {
        return new Entrega();
	}
}
