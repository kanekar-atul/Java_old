package com.crud.examples.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.crud.examples.model.Employee;

public class JPAUpdateEntityExample {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPACore");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Employee e = manager.find(Employee.class, 1205);
		System.out.println(e);
		e.setSalary(34000);
		manager.persist(e);
		manager.getTransaction().commit();
		System.out.println(e);
		manager.close();

	}

}
