package br.com.soa.model;

import java.util.Date;

public class Entity {
	
	private char idSituacao;
	private Date dhAtualizacao;

	public char getIdSituacao() {
		return idSituacao;
	}
	public void setIdSituacao(char idSituacao) {
		this.idSituacao = idSituacao;
	}
	public Date getDhAtualizacao() {
		return dhAtualizacao;
	}
	public void setDhAtualizacao(Date dhAtualizacao) {
		this.dhAtualizacao = dhAtualizacao;
	}
}
