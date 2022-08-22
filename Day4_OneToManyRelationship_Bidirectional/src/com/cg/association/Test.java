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
		dept.setId(101);
		dept.setName("IT");
		
		Department dept1=new Department();
		dept1.setId(102);
		dept1.setName("Computer");
		
		Department dept2=new Department();
		dept2.setId(103);
		dept2.setName("Electrical");
		
		
		Student s=new Student();
		s.setName("Priyanka");
		s.setFees(65000);
		s.setDept(dept);
		
		Student s1=new Student();
		s1.setName("Vaishnavi");
		s1.setFees(75000);
		s1.setDept(dept1);
		
		Student s2=new Student();
		s2.setName("Rohan");
		s2.setFees(120000);
		s2.setDept(dept2);
		
		em.persist(s);
		em.persist(s1);
		em.persist(s2);
		
		System.out.println("Added Students with department");
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}
