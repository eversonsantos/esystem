package br.com.soa.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Pessoa extends Entity{
	
	private String nmPessoa;
	private Integer nrIdade;
	private char idSexo;
	
	
	public Pessoa(String nmPessoa, Integer nrIdade, char idSexo) {
		super();
		this.nmPessoa = nmPessoa;
		this.nrIdade = nrIdade;
		this.idSexo = idSexo;
	}
	public String getNmPessoa() {
		return nmPessoa;
	}
	public void setNmPessoa(String nmPessoa) {
		this.nmPessoa = nmPessoa;
	}
	public Integer getNrIdade() {
		return nrIdade;
	}
	public void setNrIdade(Integer nrIdade) {
		this.nrIdade = nrIdade;
	}
	public char getIdSexo() {
		return idSexo;
	}
	public void setIdSexo(char idSexo) {
		this.idSexo = idSexo;
	}
	
	
}
