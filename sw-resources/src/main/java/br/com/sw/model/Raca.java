package br.com.sw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sw.dominio.DominioSexo;

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
	private Long codigo;
	
	@Column(name = "nm_rac")
	private String nome;
	
//	
//	private List<Classes> classes;

	public String getNome() {
		return nome;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}