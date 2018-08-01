package br.com.sw.model;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity(name = "tbl_membro")
public class Membro extends EntityDefault implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cd_mem")
	private Long codigo;

	@Column(name="nm_ape")
	private String apelido;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cd_pes")
	private Pessoa pessoa;
	
	@OneToMany(mappedBy="membro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Personagem> personagens;
	
	public Membro() {
		this.pessoa = new Pessoa();
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public List<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(List<Personagem> personagens) {
		this.personagens = personagens;
	}

	public int getNumerosPersonagens() {
		if(this.personagens != null)
			return this.personagens.size();
		return 0;
	}
	
}
