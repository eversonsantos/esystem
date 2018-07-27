package br.com.sw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_raca")
public class Raca extends EntityDefault {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2968600874969635011L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_rac")
	private Long id;
	
	@Column(name = "nm_rac")
	private String nome;
	
//	
//	private List<Classes> classes;

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
	
}
