package com.jpql.main;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.crud.examples.model.Employee;

public class ExampleOne {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPACore");
		EntityManager manager =  factory.createEntityManager();
		Query query =  (Query) manager.createQuery("Select e from Employee e");
		List<Employee> list =  ((javax.persistence.Query) query).getResultList();
		
		for (Employee e : list) {
			System.out.println(e.getEid()+" "+e.getEname()+" "+e.getDeg()+" "+e.getSalary());
		}

	}

}
