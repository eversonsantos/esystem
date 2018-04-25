package br.com.webstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.webstore.dominio.DominioEscolaridade;
import br.com.webstore.dominio.DominioEstCivil;
import br.com.webstore.dominio.DominioGenero;

@Entity
@Table(name="tbl_ipfisica")
public class IPFisica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_pfis")
	private Long cdPfis;

	@Column(name="nr_rg")
	private String nrRg;
	
	@Column(name="ds_sxo")
	@Enumerated(EnumType.STRING)
	private DominioGenero chSxo;
	
	@Column(name="ds_est_civil")
	@Enumerated(EnumType.STRING)
	private DominioEstCivil dsEstCivil;
	
	@Column(name="ds_esc")
	@Enumerated(EnumType.STRING)
	private DominioEscolaridade dsEsc;

	public IPFisica() {
		// TODO Auto-generated constructor stub
	}

	public DominioGenero getChSxo() {
		return chSxo;
	}

	public void setChSxo(String chSxo) {
		this.chSxo = DominioGenero.parser(chSxo);
	}

	public DominioEstCivil getDsEstCivil() {
		return dsEstCivil;
	}

	public void setDsEstCivil(String dsEstCivil) {
		this.dsEstCivil = DominioEstCivil.parser(dsEstCivil);
	}

	public String getNrRg() {
		return nrRg;
	}

	public void setNrRg(String nrRg) {
		this.nrRg = nrRg;
	}

	public DominioEscolaridade getDsEsc() {
		return dsEsc;
	}

	public void setDsEsc(String dsEsc) {
		this.dsEsc = DominioEscolaridade.parser(dsEsc);
	}

}
