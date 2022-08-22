package com.cg.association;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="department_Data")

public class Department 
{
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	private Set <Student> students= new HashSet<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student student) {
		student.setDept(this);
		this.getStudents().add(student);
	}
	
	
	
	
	
	
	
	
	
}
