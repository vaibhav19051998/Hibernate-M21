package com.cg.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s=new Student();
		s.setStudentName("Vaibhav");
		
		Student s1=new Student();
		s1.setStudentName("Chetan");
		
		
		Address a=new Address();
		a.setAddressId(20);
		a.setStreet("Ganpati Matha");
		a.setCity("Pune");
		a.setState("Maharashtra");
		a.setZipcode(411058);
		
		Address a1=new Address();
		a1.setAddressId(30);
		a1.setStreet("Guru Mandir");
		a1.setCity("Amravati");
		a1.setState("Maharashtra");
		a1.setZipcode(444404);
		
		s.setAddress(a);
		em.persist(s);
		System.out.println("Row Inserted");
		
		s1.setAddress(a1);
		em.persist(s1);
		System.out.println("Row Inserted");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		
		
	}

}
