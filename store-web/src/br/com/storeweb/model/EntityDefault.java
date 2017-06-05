/**
 * 
 */
package br.com.storeweb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author everson.lisboa.santos@gmail.com
 *Data : 23/06/2016
 *
 */
@MappedSuperclass
public class EntityDefault {

	@Column(name ="cd_usu_atu")
	private String cd_usu_atu;
	
	@Column(name = "dh_atu")
	private Date dh_atu;
	
	
	public String getCd_usu_atu() {
		return cd_usu_atu;
	}
	public void setCd_usu_atu(String cd_usu_atu) {
		this.cd_usu_atu = cd_usu_atu;
	}
	public Date getDh_atu() {
		return new Date();
	}
	
}
