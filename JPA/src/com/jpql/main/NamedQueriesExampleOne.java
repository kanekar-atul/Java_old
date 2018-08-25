package com.jpql.main;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpql.main.model.Employee11;

public class NamedQueriesExampleOne {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPACore");
		EntityManager entitymanager = emfactory.createEntityManager();
		Query query = (Query) entitymanager.createNamedQuery("find employee by id");

		((javax.persistence.Query) query).setParameter("id", 1);
		List<Employee11> list = (List<Employee11>) ((javax.persistence.Query) query).getResultList();

		for (Employee11 e : list) {
			System.out.print("Employee ID :" + e.getEid());
			System.out.println("\t Employee Name :" + e.getEname());
		}
	}
}
