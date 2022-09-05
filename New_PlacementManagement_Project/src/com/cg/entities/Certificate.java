package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity // For Creating Table in MySQL
@Table(name="Certificate")
public class Certificate 
{
	
	@Id  //for primary Key
	@Column(name="Certificate_id")
	private long id;
	private int year;
	@OneToOne(mappedBy="Certificate") //@OneToOne mapping to certificate and student
	@JoinColumn(name="Certificate_id")
	private Student student;
	
	// getter and setter method
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
