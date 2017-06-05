package br.com.storeweb.service;

import java.util.ArrayList;
import java.util.List;

public class ComboService {

	public List<String> comboEscolaridade() {
		List<String> escolaridades = new ArrayList<>();
		escolaridades.add("Fundamental Incompleto");
		escolaridades.add("Fundamental Completo");
		escolaridades.add("Médio Incompleto");
		escolaridades.add("Médio Completo");
		escolaridades.add("Superior Incompleto");
		escolaridades.add("Superior Completo");
		return escolaridades;
	}
	
	public List<String> comboEstadoCivil() {
		List<String> estadoCivis = new ArrayList<>();
		estadoCivis.add("Solteiro(a)");
		estadoCivis.add("Casado(a)");
		estadoCivis.add("Separado(a)");
		estadoCivis.add("Viúvo(a)");
		estadoCivis.add("União Estável");
		return estadoCivis;
	}
	
	
}
