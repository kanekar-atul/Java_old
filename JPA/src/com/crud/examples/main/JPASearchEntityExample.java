package com.crud.examples.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.crud.examples.model.Employee;

public class JPASearchEntityExample {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPACore");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Employee e =   manager.find(Employee.class,1202);
		 System.out.println(e);
		manager.close();
		

	}

}
