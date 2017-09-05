package br.com.casadocodigo.model;

import java.math.BigDecimal;

import br.com.casadocodigo.dominio.LivroDominio;

public class Preco {

	private BigDecimal preco;
	private LivroDominio livroTipo;
	
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public LivroDominio getLivroTipo() {
		return livroTipo;
	}
	public void setLivroTipo(LivroDominio livroTipo) {
		this.livroTipo = livroTipo;
	}
	
	
}
