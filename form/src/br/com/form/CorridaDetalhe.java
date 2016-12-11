package br.com.form;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.Part;


@ManagedBean(name = "mbCorridaDetalhe")
@SessionScoped
public class CorridaDetalhe extends PilotoService{

	private List<Piloto> pilotos;
	private Part file;
	private String content;
	private static final int MAX_SIZE = 2 * 1024 * 1024;
	FacesMessage msg = null;
	
	@PostConstruct
	private void init(){
		pilotos = new ArrayList<Piloto>();
	}
	
	public void uploadFile(){
	        try {
	        	pilotos.clear();
	        	content = parseFileToString(file.getInputStream());
	        	pilotos.addAll(parseStringToPilotos(content));
	            if(pilotos.isEmpty()){
	            	msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
	                        "Layout do arquivo selecionado inválido, favor analisar arquivo", "");
	            	FacesContext.getCurrentInstance().addMessage(null, msg);
	            	return;
	            }
	        } catch (IOException e) {
	        	
	        	
	        }
	}

    public void valida(FacesContext context, UIComponent component, Object value) {

        Part arquivo = (Part) value;
        if(arquivo == null || arquivo.getSize() <= 0 || arquivo.getContentType().isEmpty()){
        	msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                    "Selecione um arquivo", "Nenhum um arquivo selecionado.");
            throw new ValidatorException(msg);
        }
        
        if (arquivo.getSize() > MAX_SIZE) {
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                    "Arquivo muito grande", "O arquivo deve ter o tamanho máximo de 2mb.");
            throw new ValidatorException(msg);
        }

        if (!"text/plain".equals(arquivo.getContentType())) {
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                    "Tipo de arquivo inválido", "O arquivo deve ser do tipo texto.");
            throw new ValidatorException(msg);
        }
    }
	public void clean(){
		pilotos.clear();
	}

	public List<Piloto> getPilotos() {
		return pilotos;
	}

	public void setPilotos(List<Piloto> pilotos) {
		this.pilotos = pilotos;
	}

	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		this.file = file;
	}

}
