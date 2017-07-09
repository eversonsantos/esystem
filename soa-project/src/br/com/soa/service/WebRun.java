package br.com.soa.service;

import javax.xml.ws.Endpoint;

public class WebRun {

	public static void main(String[] args) {
		Endpoint.publish("http://10.0.20.136:8080/soa-project", new ServicePessoa());
		System.out.println("Serviço incializado!");

	}

}
