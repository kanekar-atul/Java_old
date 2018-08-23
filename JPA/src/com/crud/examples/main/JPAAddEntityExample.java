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
		employee.setEid(1206);
		employee.setEname("Ram");
		employee.setSalary(80000);
		employee.setDeg("Jr.Developer");
		
		manager.persist(employee);
		
		manager.getTransaction().commit();
		
		manager.close();
		

	}

}
