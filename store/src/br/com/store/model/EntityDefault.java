/**
 * 
 */
package br.com.store.model;

import java.util.Date;

/**
 * @author everson.lisboa.santos@gmail.com
 *Data : 23/06/2016
 *
 */
public class EntityDefault {

	private String cd_usu_atu;
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
