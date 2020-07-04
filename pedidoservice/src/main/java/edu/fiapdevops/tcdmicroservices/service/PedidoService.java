package edu.fiapdevops.tcdmicroservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import edu.fiapdevops.tcdmicroservices.config.ServiceConfig;
import edu.fiapdevops.tcdmicroservices.model.Pedido;
import edu.fiapdevops.tcdmicroservices.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository PedidoRepository;

	@Autowired
	private ServiceConfig config;
	
	/*
	@HystrixCommand(fallbackMethod = "buildFallbackPedido", threadPoolKey = "PedidoByUFThreadPool", threadPoolProperties = {
			@HystrixProperty(name = "coreSize", value = "30"),
			@HystrixProperty(name = "maxQueueSize", value = "10") }, commandProperties = {
					@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
					@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "75"),
					@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "7000"),
					@HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "15000"),
					@HystrixProperty(name = "metrics.rollingStats.numBuckets", value = "5") })
	*/
	
	public Iterable<Pedido> getAllPedido() {
		return PedidoRepository.findAll();
	}
	
	public Pedido getPedidoById(String id) {
		return PedidoRepository.findByid(id);
	}

/*	private Pedido buildFallbackPedido(String uf) {
		Pedido Pedido = new Pedido().withId("00").withUf(uf);
				.withSLA("Sorry no SLA information currently available");
		return Pedido;
	}*/

	public void savePedido(Pedido Pedido) {
		PedidoRepository.save(Pedido);
	}
	
	public void updatePedido(Pedido Pedido) {
		PedidoRepository.save(Pedido);
	}

	public void deletePedido(String id) {
		PedidoRepository.deleteById(id);
	}

}