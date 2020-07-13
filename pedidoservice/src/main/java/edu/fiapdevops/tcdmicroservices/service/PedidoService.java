package edu.fiapdevops.tcdmicroservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fiapdevops.tcdmicroservices.clients.*;
import edu.fiapdevops.tcdmicroservices.config.ServiceConfig;
import edu.fiapdevops.tcdmicroservices.model.Entrega;
import edu.fiapdevops.tcdmicroservices.model.Pedido;
import edu.fiapdevops.tcdmicroservices.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	ServiceConfig config;
	
	@Autowired
	EntregaFeignClient entregaFeignClient;

	public Iterable<Pedido> getAllPedido() {
		return pedidoRepository.findAll();
	}
	
	public Pedido getPedidoById(String id) {
		Pedido pedido = pedidoRepository.findById(id).get();
		Entrega entrega = entregaFeignClient.getEntrega(pedido.getUf());
		pedido.setSla(entrega.getSla());
		return pedido;
	}

	public void savePedido(Pedido Pedido) {
		pedidoRepository.save(Pedido);
	}
	
	public void updatePedido(Pedido Pedido) {
		pedidoRepository.save(Pedido);
	}

	public void deletePedido(String id) {
		pedidoRepository.deleteById(id);
	}

}