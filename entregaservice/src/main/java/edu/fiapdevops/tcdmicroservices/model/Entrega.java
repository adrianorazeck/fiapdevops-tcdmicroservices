package edu.fiapdevops.tcdmicroservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBENTREGA")
public class Entrega {
	@Id
	@Column(name = "ID", nullable = false)
	private String id;

	@Column(name = "UF", nullable = false)
	private String uf;

	@Column(name = "SLA", nullable = false)
	private String sla = "";


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

	public String getSla() {
		return sla;
	}

	public void setSLA(String sla) {
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

	public Entrega withSLA(String sla) {
		setSLA(sla);
		return this;
	}

}

