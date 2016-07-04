package br.com.storeweb.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateBase {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("storeweb");
		EntityManager manager = factory.createEntityManager();
		
		System.exit(0);

	}

}
