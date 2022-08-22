package com.cg.association1;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Dept_Data")

public class Department1 
{
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy="Dept",cascade=CascadeType.ALL)
	private Set <Student1> students1= new HashSet<>();
	
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
	public Set<Student1> getStudents1() {
		return students1;
	}
	public void setStudents1(Set<Student1> students1) {
		this.students1 = students1;
	}
	
	public void addStudent1(Student1 students1) {
		students1.setDept(this);
		this.getStudents1().add(students1);
	}
	
}
