package br.com.storeweb.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="tbl_contato", schema = "dbo")
public class Contato extends EntityDefault{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "cd_con")
	private Long cd_con;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cd_tel")
	private List<Telefone> telefones = new ArrayList<Telefone>();
	
	
	public Contato() {

	}
	
	public Long getCd_con() {
		return cd_con;
	}

	public void setCd_con(Long cd_con) {
		this.cd_con = cd_con;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

//	public Pessoa getPessoa() {
//		return pessoa;
//	}
//
//	public void setPessoa(Pessoa pessoa) {
//		this.pessoa = pessoa;
//	}
	
	
	
	
	
}
