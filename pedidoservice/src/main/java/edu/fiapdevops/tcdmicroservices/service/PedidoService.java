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

	private Pedido withPedidoSetSla(Pedido pedido) {
		return pedido.withSla(entregaFeignClient.getEntrega(pedido.getUf()).getSla());
	}

	private Iterable<Pedido> withAllPedidosSetSla(Iterable<Pedido> allPedidos) {
		allPedidos.forEach(pedido -> pedido.setSla(entregaFeignClient.getEntrega(pedido.getUf()).getSla()));
		return allPedidos;
	}

	public Iterable<Pedido> getAllPedido() {
		Iterable<Pedido> allPedidos = pedidoRepository.findAll();
		return withAllPedidosSetSla(allPedidos);
	}
	
	public Pedido getPedidoById(String id) {
		Pedido pedido = pedidoRepository.findById(id).get();		
		return withPedidoSetSla(pedido);
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