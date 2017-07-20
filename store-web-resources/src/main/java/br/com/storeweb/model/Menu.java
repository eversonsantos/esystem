package br.com.storeweb.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_menu", schema = "dbo")
public class Menu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cd_men;
	
	@Column(name = "nm_men", length = 100, columnDefinition = "varchar")
	private String nm_men;
	
	@Column(name = "ds_men", length = 100, columnDefinition = "varchar")
	private String ds_men;
	
	@Column(name = "pth_url_men", length = 100, columnDefinition = "varchar")
	private String pth_url_men;
	
	@Column(name = "pth_url_ico", length = 100, columnDefinition = "varchar")
	private String pth_url_ico;
	
	@Column(name = "id_sit", length = 1)
	private String id_sit;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cd_men")
	private List<Funcao> funcoes;
	
//	private Sistema sistema;
	
	public Menu() {
		
	}
	
	
	
}
