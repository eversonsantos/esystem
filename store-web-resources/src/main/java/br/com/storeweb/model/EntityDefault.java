/**
 * 
 */
package br.com.storeweb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author everson.lisboa.santos@gmail.com
 *
 *
 */
@MappedSuperclass
public class EntityDefault {

	@Column(name = "cd_usu_atu")
	private String cdUsuarioAtulizador;

	@Column(name = "dh_atu")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dhAtualizacao;

	@Column(name = "id_sit")
	private String idSit;

	public String getCdUsuarioAtulizador() {
		return cdUsuarioAtulizador;
	}

	public void setCdUsuarioAtulizador(String cdUsuarioAtulizador) {
		this.cdUsuarioAtulizador = cdUsuarioAtulizador;
	}

	public Date getDhAtualizacao() {
		return dhAtualizacao;
	}

	public void setDhAtualizacao(Date dhAtualizacao) {
		this.dhAtualizacao = dhAtualizacao;
	}

	public String getIdSit() {
		return idSit;
	}

	public void setIdSit(String idSit) {
		this.idSit = idSit;
	}

}
