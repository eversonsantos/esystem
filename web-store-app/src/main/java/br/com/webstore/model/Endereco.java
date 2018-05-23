package br.com.webstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.webstore.dominio.DominioTipoTelefone;
import br.com.webstore.utils.FormatUtils;

@Entity
@Table(name="tbl_endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cd_end")
	private Long cdEnd;
	
	@Column(name="cd_cep")
	private String cdCep;
	
	@Column(name="nm_log")
	private String nmLog;
	
	@Column(name="nr_end")
	private String nrEnd;

	@Column(name="nm_cid")
	private String nmCid;
	
	@Column(name="nm_bai")
	private String nmBai;
	
	@Column(name="sg_uf")
	private String sgUf;
	
	@Column(name="ds_cpl")
	private String dsCpl;
	
	@Column(name="nr_tel")
	private String nrTel;
	
	@Column(name="ds_tp_tel")
	@Enumerated(EnumType.STRING)
	private DominioTipoTelefone dsTipoTel;

	public Long getCdEnd() {
		return cdEnd;
	}

	public void setCdEnd(Long cdEnd) {
		this.cdEnd = cdEnd;
	}

	public String getCdCep() {
		return cdCep;
	}

	public void setCdCep(String cdCep) {
		this.cdCep = cdCep;
	}

	public String getNmLog() {
		return nmLog;
	}

	public void setNmLog(String nmLog) {
		this.nmLog = nmLog;
	}

	public String getNrEnd() {
		return nrEnd;
	}

	public void setNrEnd(String nrEnd) {
		this.nrEnd = nrEnd;
	}

	public String getNmCid() {
		return nmCid;
	}

	public void setNmCid(String nmCid) {
		this.nmCid = nmCid;
	}

	public String getNmBai() {
		return nmBai;
	}

	public void setNmBai(String nmBai) {
		this.nmBai = nmBai;
	}

	public String getSgUf() {
		return sgUf;
	}

	public void setSgUf(String sgUf) {
		this.sgUf = sgUf;
	}

	public String getDsCpl() {
		return dsCpl;
	}

	public void setDsCpl(String dsCpl) {
		this.dsCpl = dsCpl;
	}
	
	
	public String getNrTel() {
		return nrTel;
	}

	public void setNrTel(String nrTel) {
		this.nrTel = nrTel;
	}

	public DominioTipoTelefone getDsTipoTel() {
		return dsTipoTel;
	}

	public void setDsTipoTel(String dsTipoTel) {
		this.dsTipoTel = DominioTipoTelefone.parser(dsTipoTel);
	}

	public String getCepFormatted() {
		String cep = String.valueOf(this.cdCep);
		if(cep != null || !"".equals(cep))
			return FormatUtils.formartString(cep, "#####-###");
		return "";
	}
	
	
}
