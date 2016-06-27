package br.com.storeweb.model;

import java.util.List;

public class PessoaFisica {

	private String dataNascimento;
	private int idade;
	private String genero;
	private List<Documento> documentos;
	private String nacionalidade;
	private String naturalidade;
//	private List<Filiacao> filiacao;
	private EstadoCivil eCivil;
	private Escolaridade escolaridade;
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public List<Documento> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public EstadoCivil geteCivil() {
		return eCivil;
	}
	public void seteCivil(EstadoCivil eCivil) {
		this.eCivil = eCivil;
	}
	public Escolaridade getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	
	
}
