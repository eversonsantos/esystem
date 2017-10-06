package br.com.casadocodigo.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.com.casadocodigo.dominio.DominioLivro;

@Embeddable
public class Preco {

	@Column(scale = 2)
	private BigDecimal preco;
	private DominioLivro tipoLivro;
	
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public DominioLivro getTipoLivro() {
		return tipoLivro;
	}
	public void setTipoLivro(DominioLivro tipoLivro) {
		this.tipoLivro = tipoLivro;
	}
	
	
	
}
