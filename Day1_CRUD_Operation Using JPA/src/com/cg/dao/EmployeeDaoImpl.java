package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
	//We are going to use EntityManager method =CRUD
	private EntityManager em;
	
	//default constructor
	public EmployeeDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}

	@Override
	
	//to add => persist(objname);
	public void addEmployee(Employee emp) 
	{
		em.persist(emp);
	}

	@Override
	//to update => merge(objname);
	public void updateEmployee(Employee emp) {
		em.merge(emp);
	}

	@Override
	//To reteive a data => find(classname,pk);
	public Employee getEmployeeById(int ID) {
		
		Employee emp=em.find(Employee.class, ID);
		return emp;
	}

	@Override
	//to remove => remove(objname);
	public void removeEmployee(Employee emp) {
		em.remove(emp);		
	}

	@Override
	//Transaction method to start and close the Entity manager
	public void commitTransaction() {
		em.getTransaction().commit();		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}
	

}
