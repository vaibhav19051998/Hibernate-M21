package com.cg.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		
		//Create a new Department
		Department dept=new Department();
		dept.setId(10);
		dept.setName("Mechanical");
		
		
		Student s=new Student();
		s.setName("Ram");
		s.setFees(50000);
		s.setId(10);
		
		Student s1=new Student();
		s1.setName("Sham");
		s1.setFees(60000);
		s1.setId(11);
		
		dept.addStudent(s);
		dept.addStudent(s1);
		
		
		em.persist(dept);
		
		
		System.out.println("Added department along with two students to database");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}