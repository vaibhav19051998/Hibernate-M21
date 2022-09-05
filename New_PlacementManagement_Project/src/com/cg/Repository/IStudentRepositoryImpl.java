package com.cg.Repository;

import javax.persistence.EntityManager;

import com.cg.entities.Student;

public class IStudentRepositoryImpl implements IStudentRepository 
{
	//private static final  Student student =null;
	//we are going to use EntityManager method-CRUD
	
	private EntityManager em;
	//default constructor	
	public IStudentRepositoryImpl() {
		super();
		em=JPAUtil.getEntityManager();
		}
	//IStudentRepositoryImpl  is  Add unimplemented method
	@Override
	public Student addStudent(Student student) {
		em.persist(student);
		return student;
	}
	@Override
	public Student updateStudent(Student student) {
		em.merge(student);
		return student;
	}
	
	@Override
	public boolean deleteStudent(long id) {
		em.remove(id);
		return false;
	}
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}
	@Override
	public Student searchStudentByID(long id) {
		Student student = em.find(Student.class, id);
		return student;
	}
	@Override
	public Student searchStudentByHallticket(long ticketNo) {
		Student student = em.find(Student.class, ticketNo);
		return student;
	}

}
