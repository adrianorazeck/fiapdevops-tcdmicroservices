package edu.fiapdevops.tcdmicroservices.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.fiapdevops.tcdmicroservices.model.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, String> {
	Pedido findByid(String id);
}