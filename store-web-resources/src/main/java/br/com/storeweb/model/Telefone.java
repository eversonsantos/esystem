package br.com.storeweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_telefone", schema = "dbo")
public class Telefone extends EntityDefault{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cd_tel;
	
	@Column(name = "nr_tel")
	private Integer nrTelefone;
	
	@Column(name = "nr_ddd_tel")
	private Integer dddTelefone;
	
	@ManyToOne
	@JoinColumn(name = "cd_con")
	private Contato contato;
	
	public Telefone() {
		
	}

	public Long getCd_tel() {
		return cd_tel;
	}

	public void setCd_tel(Long cd_tel) {
		this.cd_tel = cd_tel;
	}

	public Integer getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(Integer nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

	public Integer getDddTelefone() {
		return dddTelefone;
	}

	public void setDddTelefone(Integer dddTelefone) {
		this.dddTelefone = dddTelefone;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
}
