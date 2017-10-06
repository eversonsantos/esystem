package br.com.casadocodigo.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_livro")
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_lvr")
	private Long id;
	@Column(name = "nm_tit")
	private String titulo;
	@Column(name = "ds_lvr")
	private String descricao;
	@Column(name = "nr_pag")
	private int numeroPaginas;
	
	@ElementCollection
	private Collection<Preco> precos = new ArrayList<Preco>();
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public Collection<Preco> getPrecos() {
		return precos;
	}
	public void setPrecos(Collection<Preco> precos) {
		this.precos = precos;
	}

}
