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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.fiapdevops.tcdmicroservices.model.Pedido;
import edu.fiapdevops.tcdmicroservices.service.PedidoService;

@RestController
@RequestMapping(value = "v1/api/pedido")
public class PedidoServiceController {
	@Autowired
	private PedidoService pedidoService;

	@Autowired
	private HttpServletRequest request;

	private static final Logger logger = LoggerFactory.getLogger(PedidoServiceController.class);

	@GetMapping(value = "/")
	public Iterable<Pedido> all (){
		return pedidoService.getAllPedido();
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public Pedido getPedido (@PathVariable("id") String id){
		return pedidoService.getPedidoById(id);
	}
	
	@RequestMapping(value = "/alterar", method = RequestMethod.PUT)
	public void updatePedido(@RequestBody Pedido Pedido) {
		pedidoService.updatePedido(Pedido);
	}

	@RequestMapping(value = "/criar", method = RequestMethod.POST)
	public void savePedido(@RequestBody Pedido Pedido) {
		pedidoService.savePedido(Pedido);
	}

	@RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePedido(@PathVariable("id") String id) {
		pedidoService.deletePedido(id);
	}
}
