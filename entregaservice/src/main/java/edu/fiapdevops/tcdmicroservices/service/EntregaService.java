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
	ServiceConfig config;
	
	
	public Iterable<Entrega> getAllEntrega() {
		return entregaRepository.findAll();
	}
	
	public Entrega getSLAByUF(String uf) {
		return entregaRepository.findByuf(uf);
	}
	
	public Entrega getEntregaById(String id) {
		return entregaRepository.findByid(id);
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