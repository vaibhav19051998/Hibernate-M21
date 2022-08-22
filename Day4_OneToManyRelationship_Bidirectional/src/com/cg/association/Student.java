package com.cg.association;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Student1")
public class Student implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="Student_name")
	private String name;
	private double Fees;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Department_ID")
	private Department dept;
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
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
}