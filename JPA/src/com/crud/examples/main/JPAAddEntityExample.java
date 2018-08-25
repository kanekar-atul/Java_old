package com.crud.examples.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.crud.examples.model.Employee;

public class JPAAddEntityExample {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPACore");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Employee employee = new Employee();
		employee.setEid(1203);
		employee.setEname("Amit");
		employee.setSalary(50000);
		employee.setDeg("Sr.Developer");
		
		manager.persist(employee);
		
		manager.getTransaction().commit();
		
		manager.close();
		

	}

}
