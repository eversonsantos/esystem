package br.com.form;

import java.io.File;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Componentes extends PilotoService{
	
	private List<Piloto> pilotos;
	private File file;
	private String content;	
	
	public Componentes(File file) {
		this.file = file;
	}

	public DefaultTableModel preencheTabela(){
		DefaultTableModel tableModel = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"C\u00F3digo", "Piloto"
				}
			);
		tableModel.setNumRows(0);
		tableModel.addRow(new Object[]{"Everson"});
		return tableModel;
	}

	public List<Piloto> getPilotos() {
		return pilotos;
	}

	public void setPilotos(List<Piloto> pilotos) {
		this.pilotos = pilotos;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
