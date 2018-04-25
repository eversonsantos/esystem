package br.com.webstore.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.webstore.dominio.DominioTipoPessoa;
import br.com.webstore.utils.FormatUtils;

@Table(name = "tbl_pessoa")
@Entity
public class Pessoa extends EntityDefault {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cd_pes")
	private Long cdPes;

	@Column(name="nm_pes")
	private String nmPes;
	
	@Column(name="nr_cic")
	private String nrCic;
	
	@Column(name="id_tp_pes")
	@Enumerated(EnumType.STRING)
	private DominioTipoPessoa idTipoPessoa;
	
	@JoinColumn(name="cd_pfis")
	@OneToOne(cascade = CascadeType.ALL)
	private IPFisica cdPfis;
	
	public Long getCdPes() {
		return cdPes;
	}

	public void setCdPes(Long cdPes) {
		this.cdPes = cdPes;
	}

	public String getNmPes() {
		return nmPes;
	}

	public void setNmPes(String nmPes) {
		this.nmPes = nmPes;
	}

	public String getNrCic() {
		return nrCic;
	}

	public void setNrCic(String nrCic) {
		this.nrCic = nrCic;
	}

	public DominioTipoPessoa getIdTipoPessoa() {
		return idTipoPessoa;
	}

	public void setIdTipoPessoa(String idTipoPessoa) {
		this.idTipoPessoa = DominioTipoPessoa.parser(idTipoPessoa);
	}
	
	public IPFisica getCdPfis() {
		return cdPfis;
	}

	public void setCdPfis(IPFisica cdPfis) {
		this.cdPfis = cdPfis;
	}

	public String getNrCicFormatted() {
		if(this.idTipoPessoa != null) {
			if(this.idTipoPessoa.compareTo(DominioTipoPessoa.FISICA) == 0)
				return FormatUtils.formartString(getNrCic(), "###.###.###-##");
			return FormatUtils.formartString(getNrCic(), "##.###.###/####-##");
		}
		return "";
	}
}
