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

/**
 * @author everson.lisboa.santos@gmail.com
 *Data : 23/06/2016
 *
 */
@Entity(name = "tbl_produto")
public class Produto extends EntityDefault{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cd_prd;
	
	@Column(name="nm_prd", length = 150, nullable = false)
	private String nm_prd;
	
	@Column(name = "vr_prd", columnDefinition = "numeric")
	private BigDecimal vr_prd;

	public String getCd_prd() {
		return cd_prd;
	}

	public void setCd_prd(String cd_prd) {
		this.cd_prd = cd_prd;
	}

	public String getNm_prd() {
		return nm_prd;
	}

	public void setNm_prd(String nm_prd) {
		this.nm_prd = nm_prd;
	}

	public BigDecimal getVr_prd() {
		return vr_prd;
	}

	public void setVr_prd(BigDecimal vr_prd) {
		this.vr_prd = vr_prd;
	}
}
