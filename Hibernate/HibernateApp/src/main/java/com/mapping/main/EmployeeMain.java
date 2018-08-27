package com.mapping.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mapping.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		session.getTransaction().begin();

		Employee e = new Employee();
		e.setId(1);
		e.setFirstName("Atul");
		e.setLastName("K");
		e.setSalary(100000);

		session.save(e);

		session.getTransaction().commit();

		session.close();
		factory.close();

	}

}
