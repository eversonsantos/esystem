/**
 * 
 */
package br.com.storeweb.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author everson.lisboa.santos@gmail.com Data : 23/06/2016
 *
 */

@Entity
@Table(name = "tbl_produto", schema = "dbo")
public class Produto extends EntityDefault {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;

	@Column(name = "nm_prd")
	private String nome;

	@Column(name = "vr_prd")
	private BigDecimal valor;

	public Produto() {
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
