package br.com.storeweb.model;

import java.util.List;

public class Contato extends UsuarioAtualizador{

	private Long id;
	private List<Telefone> telefones;
	private Pessoa pessoa;
	
	public Contato() {

	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
	
	
}
