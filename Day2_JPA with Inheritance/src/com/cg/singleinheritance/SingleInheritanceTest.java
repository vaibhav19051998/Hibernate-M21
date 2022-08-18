package com.cg.singleinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleInheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
	
		//Create one Employee
		Employee emp=new Employee();
		emp.setName("Vaibhav");
		emp.setSalary(50000);
		em.persist(emp);
		
		//Create Second Employee
		Employee emp1=new Employee();
		emp1.setName("Priyanka");
		emp1.setSalary(70000);
		em.persist(emp1);
		
		//Create one Manager
		Manager m=new Manager();
		m.setName("Rohan");
		m.setSalary(80000);
		m.setDeptName("IT");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added succssfully in the Database");
		em.close();
		factory.close();
	}

}
