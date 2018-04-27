/**
 * 
 */
package br.com.webstore.model;

import java.io.Serializable;
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
public class EntityDefault implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "cd_usu_atu")
	private String cdUsuAtu;

	@Column(name = "dh_atu")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dhAtu;

//	@Enumerated(EnumType.ORDINAL)
	@Column(name = "id_sit")
	private String idSit;

	
	public String getCdUsuAtu() {
		return cdUsuAtu;
	}

	public void setCdUsuAtu(String cdUsuAtu) {
		this.cdUsuAtu = cdUsuAtu;
	}

	public Date getDhAtu() {
		return dhAtu;
	}

	public void setDhAtu(Date dhAtu) {
		this.dhAtu = dhAtu;
	}

	public String getIdSit() {
		return idSit;
	}

	public void setIdSit(String idSit) {
		this.idSit = idSit;
	}

}
