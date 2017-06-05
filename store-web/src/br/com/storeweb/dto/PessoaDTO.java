package br.com.storeweb.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.storeweb.model.Endereco;
import br.com.storeweb.model.Pessoa;
import br.com.storeweb.model.PessoaFisica;
import br.com.storeweb.model.PessoaJuridica;
import br.com.storeweb.model.Telefone;

public class PessoaDTO {
	
	private Pessoa pessoa;
	private PessoaFisica pessoaFisica;
	private PessoaJuridica pessoaJuridica;
	private List<Telefone> telefones;
	private Endereco endereco;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public PessoaFisica getPessoaFisica() {
		if(this.pessoaFisica == null){
			return new PessoaFisica();
		}
		return pessoaFisica;
	}
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	
	public PessoaJuridica getPessoaJuridica() {
		if(this.pessoaJuridica == null){
			return new PessoaJuridica();
		}
		return pessoaJuridica;
	}
	
	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}
	public List<Telefone> getTelefones() {
		if(this.telefones.isEmpty()){
			return new ArrayList<Telefone>();
		}
		return telefones;
	}
	
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public Endereco getEndereco() {
		if(this.endereco == null){
			return new Endereco();
		}
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
