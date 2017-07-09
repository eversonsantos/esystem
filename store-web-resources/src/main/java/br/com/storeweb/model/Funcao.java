package br.com.storeweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "tbl_funcao")
public class Funcao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cd_fuc;
	
	@Column(name = "nm_men", length = 100, columnDefinition = "varchar")
	private String nm_fuc;
	
	@Column(name = "ds_men", length = 100, columnDefinition = "varchar")
	private String ds_fuc;
	
	@Column(name = "pth_url_men", length = 100, columnDefinition = "varchar")
	private String pth_url_fuc;
	
	@Column(name = "pth_url_ico", length = 100, columnDefinition = "varchar")
	private String pth_url_ico;
	
	@Column(name = "id_sit", length = 1)
	private String id_sit;
	
	@ManyToOne
	@JoinColumn(name ="cd_men")
	private Menu cd_men;

}
