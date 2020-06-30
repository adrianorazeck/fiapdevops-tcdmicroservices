package edu.fiapdevops.tcdmicroservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import edu.fiapdevops.tcdmicroservices.config.ServiceConfig;
import edu.fiapdevops.tcdmicroservices.model.Entrega;
import edu.fiapdevops.tcdmicroservices.repository.EntregaRepository;

@Service
public class EntregaService {

	@Autowired
	private EntregaRepository entregaRepository;

	@Autowired
	private ServiceConfig config;

	@HystrixCommand(fallbackMethod = "buildFallbackEntrega", threadPoolKey = "EntregaByUFThreadPool", threadPoolProperties = {
			@HystrixProperty(name = "coreSize", value = "30"),
			@HystrixProperty(name = "maxQueueSize", value = "10") }, commandProperties = {
					@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
					@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "75"),
					@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "7000"),
					@HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "15000"),
					@HystrixProperty(name = "metrics.rollingStats.numBuckets", value = "5") })
	
	public Iterable<Entrega> getAllEntregaSLA() {
		return entregaRepository.findAll();
	}
	
	public Entrega getSLAByUF(String uf) {
		return entregaRepository.findByuf(uf);
	}
	
	public Entrega getEntregaById(String id) {
		return entregaRepository.findByid(id);
	}

	private Entrega buildFallbackEntrega(String uf) {
		Entrega entrega = new Entrega().withId("00").withUF(uf)
				.withSLA("Sorry no SLA information currently available");
		return entrega;
	}

	public void saveEntregaSLA(Entrega entrega) {
		entregaRepository.save(entrega);
	}
	
	public void updateEntregaSLA(Entrega entrega) {
		entregaRepository.save(entrega);
	}

	public void deleteEntregaSLA(Entrega entrega) {
		entregaRepository.delete(entrega);
	}

}