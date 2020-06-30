package edu.fiapdevops.tcdmicroservices.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.fiapdevops.tcdmicroservices.model.Entrega;

@Repository
public interface EntregaRepository extends CrudRepository<Entrega, String> {
	String findSLAByUF(String UF);
	Entrega findEntregaSLAById(String id);
}