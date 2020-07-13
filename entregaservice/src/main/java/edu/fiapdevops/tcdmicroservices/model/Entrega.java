package edu.fiapdevops.tcdmicroservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entregas")
public class Entrega {
	@Id
	@Column(name = "id", nullable = false)
	private String id;

	@Column(name = "uf", nullable = false)
	private String uf;

	@Column(name = "sla", nullable = false)
	private int sla = 0;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUF() {
		return uf;
	}

	public void setUF(String uf) {
		this.uf = uf;
	}

	public int getSla() {
		return sla;
	}

	public void setSla(int sla) {
		this.sla = sla;
	}
	
	public Entrega withId(String id) {
		setId(id);
		return this;
	}
	
	public Entrega withUF(String uf) {
		setUF(uf);
		return this;
	}

	public Entrega withSla(int sla) {
		setSla(sla);
		return this;
	}

}

