package com.cg.dao;

import com.cg.entities.Employee;

public interface EmployeeDao 
{
	//by default all the methods are abstract in the interface
	void addEmployee(Employee emp); //Creation
	void updateEmployee(Employee emp); //Updation
	Employee getEmployeeById(int ID); //Retrieve
	void removeEmployee(Employee emp); //Delete/Remove
	
	void commitTransaction(); // close an entity manager
	void beginTransaction(); //begin the operation of entity Manager
	

}
