package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.main.model.Admin;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPACore");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		Admin a = new Admin();
		a.setId(1);
		a.setName("John");

		manager.persist(a);
		manager.getTransaction().commit();

		manager.close();

	}

}
