package br.com.storeweb.model;

public class Situacao extends EntityDefault{

	private Long id;
	private String situacao;
	private String pathIcon;
	private String colorSituacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getPathIcon() {
		return pathIcon;
	}
	public void setPathIcon(String pathIcon) {
		this.pathIcon = pathIcon;
	}
	public String getColorSituacao() {
		return colorSituacao;
	}
	public void setColorSituacao(String colorSituacao) {
		this.colorSituacao = colorSituacao;
	}
	
	
	
}
