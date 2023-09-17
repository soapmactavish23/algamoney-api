package com.hkprogrammer.algamoney.api.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Embeddable
public class Endereco {

	@NotBlank
	@Size(max = 255)
	private String logradouro;
	
	@NotBlank
	@Size(max = 10)
	private String numero;
	
	@Size(max = 255)
	private String complemento;
	
	@NotBlank
	@Size(max = 255)
	private String bairro;
	
	@NotBlank
	@Size(max = 15)
	private String cep;
	
	@NotBlank
	@Size(max = 255)
	private String cidade;
	
	@NotBlank
	@Size(max = 100)
	private String estado;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
