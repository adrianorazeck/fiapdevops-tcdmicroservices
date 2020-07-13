package edu.fiapdevops.tcdmicroservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "pedidos")
public class Pedido {
	@Id
	@Column(name = "id", nullable = false)
	private String id;

	@Column(name = "status", nullable = false)
	private String status;

	@Column(name = "datacriacao", nullable = false)
	private String dataCriacao;

	@Column(name = "dataentrega", nullable = false)
	private String dataEntrega;

	@Column(name = "produto", nullable = false)
	private String produto;

	@Column(name = "endereco", nullable = false)
	private String endereco = "";

	@Column(name = "uf", nullable = false)
	private String uf;
	
	@Transient
	private int sla = 0;
	
	@Column(name = "municipio", nullable = false)
	private String municipio;

	@Column(name = "cep", nullable = false)
	private String cep = "";
	
	public String getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public int getSla() {
		return sla;
	}

	public void setSla(int sla) {
		this.sla = sla;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Pedido withId(String id) {
		setId(id);
		return this;
	}
	
	public Pedido withStatus(String status) {
		setStatus(status);
		return this;
	}

	public Pedido withDataCriacao(String dataCriacao) {
		setDataCriacao(dataCriacao);
		return this;
	}
	
	public Pedido withDataEntrega(String dataEntrega) {
		setDataEntrega(dataEntrega);
		return this;
	}
	
	public Pedido withProduto(String produto) {
		setProduto(produto);
		return this;
	}

	public Pedido withEndereco(String endereco) {
		setEndereco(endereco);
		return this;
	}
	
	public Pedido withUf(String uf) {
		setId(uf);
		return this;
	}
	
	public Pedido withMunicipio(String municipio) {
		setMunicipio(municipio);
		return this;
	}

	public Pedido withCep(String cep) {
		setCep(cep);
		return this;
	}
	
	public Pedido withSla(int sla) {
		setSla(sla);
		return this;
	}

}

