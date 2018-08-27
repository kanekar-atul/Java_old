package com.annotation.examples;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EntityAnnotation {

	public static void main(String args[]) {
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("JPACore");
		EntityManager manager =  factory.createEntityManager();
		manager.getTransaction().begin();
		
		Customer c = new Customer();
		c.setId(6);
		c.setName("John");
		
		manager.persist(c);
		manager.getTransaction().commit();
		
		
		
		
		 //Scalar function
	      Query query = manager.
	      createQuery("Select UPPER(e.name) from OurCust e");
	      List<String> list = query.getResultList();

	      for(String e:list) {
	         System.out.println("Employee NAME :"+e);
	      }
	      
		
		manager.close();
		factory.close();
	}
}
