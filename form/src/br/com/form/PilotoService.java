package br.com.form;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PilotoService extends Utils{

	public  List<Piloto> parseStringToPilotos(String content){
		List<Piloto> pilotos = new ArrayList<Piloto>();
		String [] lines = content.split("\n");
		try {
		for (String s : lines) {
			Piloto piloto = new Piloto();
			if(pilotos.isEmpty()){
				piloto.setCdPil(Long.valueOf(s.substring(19, 22).trim()));
				piloto.setNmPil(s.substring(24, 44).trim());
				piloto.setNrPosicao(1);
				piloto.getVoltas().add(new Volta(Integer.valueOf(s.substring(44, 50).trim()), s.substring(50, 70).trim(), 0, formataVelocidadeMedia(s.substring(70, 76).trim()), s.substring(0, 18).trim()));
				pilotos.add(piloto);
			}else{
				if(piloto.getVoltas().size() <= 4){
					piloto.setCdPil(Long.valueOf(s.substring(19, 22).trim()));
					piloto.setNmPil(s.substring(24, 44).trim());
					piloto.setNrPosicao(1);
					piloto.getVoltas().add(new Volta(Integer.valueOf(s.substring(44, 50).trim()), s.substring(50, 70).trim(), 0, formataVelocidadeMedia(s.substring(70, 76).trim()), s.substring(0, 18).trim()));
	
					for(Piloto p : pilotos){
						if(p.equals(piloto)){
							p.getVoltas().add(new Volta(Integer.valueOf(s.substring(44, 50).trim()), s.substring(50, 70).trim(), 0, formataVelocidadeMedia(s.substring(70, 76).trim()), s.substring(0, 18).trim()));
							piloto = null;
							break;
						}
					}
					if(piloto != null){
						pilotos.add(piloto);
					}
				}
			}
			
		}
		
		findMelhorVoltaPiloto(pilotos);
		geraClassificacao(pilotos);
		orderByPosicao(pilotos);
		removeVoltas(pilotos);
		calculaTempoToltaldeProva(pilotos);
		calculaTempoChegdaAposGanhador(pilotos);
		return pilotos;
		} catch (StringIndexOutOfBoundsException e) {
			return new ArrayList<Piloto>();
		}
	}
	
	public  void findMelhorVoltaPiloto(List<Piloto> pilotos){
		for (Piloto piloto : pilotos) {
			Integer tmVolta = 0;
			Double vlMedia = 0.0;
			for(int i = 0; i < piloto.getVoltas().size(); i++){
			tmVolta = Integer.valueOf(removeCaracteres(piloto.getVoltas().get(i).getTmVolta()));
			if(tmVolta > Integer.valueOf(removeCaracteres(piloto.getVoltas().get(i).getTmVolta()))){
				tmVolta = Integer.valueOf(removeCaracteres(piloto.getVoltas().get(i).getTmVolta()));
				piloto.setTmMelhorVolta(piloto.getVoltas().get(i).getTmVolta());
				piloto.setNrMelhorVolta(piloto.getVoltas().get(i).getNrVolta());
			}
				vlMedia =+ piloto.getVoltas().get(i).getVlMedia();
			}
			piloto.setVlMediaDuranteCorrida(calculaVelocidadeMedia(vlMedia, piloto.getVoltas().size()));
		}
		
	}
	public  void geraClassificacao(List<Piloto> pilotos){
		for (int i = 0; i < pilotos.size(); i++) {
			for (int j = 1; j < pilotos.size(); j++) {
				if(pilotos.get(i).getVoltas().size() < pilotos.get(j).getVoltas().size()){
					pilotos.get(i).setNrPosicao((i+1));
				}else if(pilotos.get(i).getVlMediaDuranteCorrida() > pilotos.get(j).getVlMediaDuranteCorrida()){
					pilotos.get(i).setNrPosicao((pilotos.get(i).getNrPosicao() + 1));
				}
			}
		}
	}
	public  void removeVoltas(List<Piloto> pilotos){
		Piloto p = pilotos.get(0);
		List<Volta> voltasAux = null;
		long hrUltimaVolta = converteTempoEmMilisegundos(parseStringToTempo(p.getVoltas().get(p.getVoltas().size()-1).getHrVolta()), Formato.HH_MM_SS_SSS);
		long tmUltimaVolta = converteTempoEmMilisegundos(parseStringToTempo(p.getVoltas().get(p.getVoltas().size()-1).getTmVolta()), Formato.MM_SS_SSS);
		long tmRestanteProva = hrUltimaVolta + tmUltimaVolta;
		for (Piloto piloto : pilotos) {
			voltasAux = new ArrayList<Volta>();
			for(Volta volta : piloto.getVoltas()){
				long tmVoltaPiloto = converteTempoEmMilisegundos(parseStringToTempo(volta.getHrVolta()), Formato.HH_MM_SS_SSS);
				if(tmVoltaPiloto < tmRestanteProva){
					voltasAux.add(volta);
				}
			}
			piloto.getVoltas().clear();
			piloto.getVoltas().addAll(voltasAux);
		}
	}

	
	public  void calculaTempoToltaldeProva(List<Piloto> pilotos){
		for(Piloto piloto : pilotos){
			String sFistLap = piloto.getVoltas().get(0).getHrVolta();
			String sLastLap = piloto.getVoltas().get(piloto.getVoltas().size()-1).getHrVolta();
			String sTmUltimaVolta = piloto.getVoltas().get(piloto.getVoltas().size()-1).getTmVolta();
			piloto.setTmTotalProva(calculaTempoToltaldeProva(sFistLap, sLastLap, sTmUltimaVolta));
		}
	}
	public  String calculaTempoToltaldeProva(String sFistLap, String sLastLap, String tmUltimaVolta){
		Calendar cFistLap = parseStringToTempo(sFistLap);
		Calendar cLastLap = parseStringToTempo(sLastLap);
		Calendar cTmUltimaVolta = parseStringToTempo(tmUltimaVolta);
		
		long lnTmTotalProva = calculaTempoToltaldeProvaEmMilisegundgo(cFistLap, cLastLap, cTmUltimaVolta);
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lnTmTotalProva);
		return formataTempo(c);
	}
	public void calculaTempoChegdaAposGanhador(List<Piloto> pilotos){
		Piloto piloto = pilotos.get(0);
		long tmTotalProvaGanhador = converteTempoEmMilisegundos(parseStringToTempo(piloto.getTmTotalProva()), Formato.MM_SS_SSS);
		
		for (Piloto p : pilotos) {
			long tmTotalProvaPiloto = converteTempoEmMilisegundos(parseStringToTempo(p.getTmTotalProva()), Formato.MM_SS_SSS);
			p.setTmProvaAposGanhador(formataTempo(converteMilisegundoDate((tmTotalProvaPiloto - tmTotalProvaGanhador))));
		}
	}
	
	@SuppressWarnings("unchecked")
	public  void orderByPosicao(List<Piloto> pilotos){
		Collections.sort(pilotos, new Comparator() {
			public int compare(Object obj1, Object obj2){
				Piloto p1 = (Piloto) obj1;
				Piloto p2 = (Piloto) obj2;
				return p1.getNrPosicao() < p2.getNrPosicao() ? -1 : (p1.getNrPosicao() > p2.getNrPosicao() ? +1 : 0);
			}
		});
	}

	
}
