package com.cg.association1;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Stud_Data")
public class Student1 implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	private int id;

	private String name;
	private double Fees;
	
	@ManyToOne
	@JoinColumn(name="dept_no")
	private Department1 Dept;
	
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
	public double getFees() {
		return Fees;
	}
	public void setFees(double fees) {
		Fees = fees;
	}
	public Department1 getDept() {
		return Dept;
	}
	public void setDept(Department1 dept) {
		this.Dept = dept;
	}
	
	
	

}
