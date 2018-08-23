package com.inheritance.table.per;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TblperClassMain {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPACore");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		// Teaching staff entity
		TeachingStaffTblPerClass ts1 = new TeachingStaffTblPerClass(1, "Gopal", "MSc MEd", "Maths");
		TeachingStaffTblPerClass ts2 = new TeachingStaffTblPerClass(2, "Manisha", "BSc BEd", "English");

		// Non-Teaching Staff entity
		NonTeachingStaffTblPerClass nts1 = new NonTeachingStaffTblPerClass(3, "Satish", "Accounts");
		NonTeachingStaffTblPerClass nts2 = new NonTeachingStaffTblPerClass(4, "Krishna", "Office Admin");

		// storing all entities
		entitymanager.persist(ts1);
		entitymanager.persist(ts2);
		entitymanager.persist(nts1);
		entitymanager.persist(nts2);

		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();
	}
}
