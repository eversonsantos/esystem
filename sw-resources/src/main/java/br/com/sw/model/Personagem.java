package br.com.sw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.sw.dominio.DominioFuncao;

@Table
@Entity(name="tbl_personagem")
public class Personagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cd_per")
	private Long codigo;
	
	@Column(name="nm_per")
	private String nome;
	
	@Column(name="sg_fun")
	private DominioFuncao funcao;
	
	@ManyToOne
	@JoinColumn(name="cd_mem")
	@JsonIgnore
	private Membro membro;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DominioFuncao getFuncao() {
		return funcao;
	}

	public void setFuncao(DominioFuncao funcao) {
		this.funcao = funcao;
	}

	public Membro getMembro() {
		return membro;
	}

	public void setMembro(Membro membro) {
		this.membro = membro;
	}
	
}
