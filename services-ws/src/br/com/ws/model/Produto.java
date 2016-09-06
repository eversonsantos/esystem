package br.com.ws.model;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class Produto {

	private Long id;
	private String nome;
	private List<Historico> precos = new ArrayList<>();
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Produto(Long id, String nome, List<Historico> precos) {
		this.id = id;
		this.nome = nome;
		this.precos = precos;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public List<Historico> getPrecos() {
		return precos;
	}



	public void setPrecos(List<Historico> precos) {
		this.precos = precos;
	}



	public String toXML(){
		return new XStream().toXML(this);
	}
	
}
