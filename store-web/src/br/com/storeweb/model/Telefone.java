package br.com.storeweb.model;

public class Telefone extends UsuarioAtualizador{
	
	private Long id;
	private Integer numeroTelefone;
	private Integer dddTelefone;
	private Situacao situacao;
	private boolean whatsapp;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(Integer numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public Integer getDddTelefone() {
		return dddTelefone;
	}
	public void setDddTelefone(Integer dddTelefone) {
		this.dddTelefone = dddTelefone;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public boolean isWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(boolean whatsapp) {
		this.whatsapp = whatsapp;
	}
	
	
	
 
}
