package br.com.storeweb.service;

import java.util.ArrayList;
import java.util.List;

public class ComboService {

	public List<String> comboEscolaridade() {
		List<String> escolaridades = new ArrayList<String>();
		escolaridades.add("Fundamental Incompleto");
		escolaridades.add("Fundamental Completo");
		escolaridades.add("M�dio Incompleto");
		escolaridades.add("M�dio Completo");
		escolaridades.add("Superior Incompleto");
		escolaridades.add("Superior Completo");
		return escolaridades;
	}
	
	public List<String> comboEstadoCivil() {
		List<String> estadoCivis = new ArrayList<String>();
		estadoCivis.add("Solteiro(a)");
		estadoCivis.add("Casado(a)");
		estadoCivis.add("Separado(a)");
		estadoCivis.add("Vi�vo(a)");
		estadoCivis.add("Uni�o Est�vel");
		return estadoCivis;
	}
	
	
}
