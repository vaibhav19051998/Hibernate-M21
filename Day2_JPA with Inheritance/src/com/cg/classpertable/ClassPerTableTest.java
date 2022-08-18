package com.cg.classpertable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClassPerTableTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
	
		//Create one Employee
		Employee1 emp2=new Employee1();
		emp2.setName("Chetan");
		emp2.setSalary(50000);
		em.persist(emp2);
		
		//Create Second Employee
		Employee1 emp3=new Employee1();
		emp3.setName("Ram");
		emp3.setSalary(70000);
		em.persist(emp3);
		
		//Create one Manager
		Manager1 m1=new Manager1();
		m1.setName("Sham");
		m1.setSalary(80000);
		m1.setDeptName("Finance");
		em.persist(m1);
		
		em.getTransaction().commit();
		System.out.println("The data is added succssfully in the Database");
		em.close();
		factory.close();
	}

}
