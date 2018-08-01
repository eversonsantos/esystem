/**
 * 
 */
package br.com.sw.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author everson.lisboa.santos@gmail.com
 *
 *
 */
@MappedSuperclass
public class EntityDefault implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "cd_usu_atu")
	private String usuario;

	@Column(name = "dh_atu")
	@Temporal(TemporalType.TIMESTAMP)
	private Date atualizacao;

	@Column(name = "id_sit")
	private String situacao;
	
	public EntityDefault() {
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getAtualizacao() {
		return atualizacao;
	}

	public void setAtualizacao(Date atualizacao) {
		this.atualizacao = atualizacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

}
