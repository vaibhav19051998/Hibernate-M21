package com.cg.joininheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinTableTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
	
		//Create one Employee
		Employee2 emp4=new Employee2();
		emp4.setName("Pratik");
		emp4.setSalary(50000);
		em.persist(emp4);
		
		//Create Second Employee
		Employee2 emp5=new Employee2();
		emp5.setName("Pavan");
		emp5.setSalary(70000);
		em.persist(emp5);
		
		//Create one Manager
		Manager2 m2=new Manager2();
		m2.setName("Vaishnavi");
		m2.setSalary(100000);
		m2.setDeptName("HR");
		em.persist(m2);
		
		em.getTransaction().commit();
		System.out.println("The data is added succssfully in the Database");
		em.close();
		factory.close();
	}

}
