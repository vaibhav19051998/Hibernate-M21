package com.cg.association1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		
		//Create a new Department
		Department1 Dept=new Department1();
		Dept.setId(10);
		Dept.setName("Mechanical");
		
		//create two instances of employees
		Student1 s=new Student1();
		s.setId(20);
		s.setName("Ram");
		s.setFees(50000);
		
		Student1 s1=new Student1();
		s1.setId(30);
		s1.setName("Sham");
		s1.setFees(60000);
		
		Dept.addStudent1(s);
		Dept.addStudent1(s1);
		
		
		em.persist(Dept);
		
		
		System.out.println("Added department along with two students to database");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}