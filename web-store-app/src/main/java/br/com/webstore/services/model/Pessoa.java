package br.com.webstore.services.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_pessoa")
@Entity
public class Pessoa extends EntityDefault {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_pes")
	private Long cdPes;

	@Column(name = "nm_pes")
	private String nmPes;

//	@OneToOne
//	@JoinColumn(name = "cd_con")
//	private Contato cdCon;

	@Column(name = "nr_cic_pes")
	private String nrCic;

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

}
