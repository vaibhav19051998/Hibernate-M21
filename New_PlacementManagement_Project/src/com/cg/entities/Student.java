package com.cg.entities;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class Student 
{
		@Id
		private long id;
		private String name;
		private String college;
		private long roll;
		private String qualification;
		private String course;
		private int year;
		private long hallTicketNo;
		
	    @OneToOne(cascade=CascadeType.ALL) //@OneToOne mapping to student and certificate
		@JoinColumn(name="Certificate_id") 
		private Certificate Certificate ;
		
		public void setCertificate(Certificate certificate) {
			Certificate = certificate;
		}
		// getter and setter method
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getRoll() {
			return roll;
		}
		public void setRoll(long roll) {
			this.roll = roll;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public long getHallTicketNo() {
			return hallTicketNo;
		}
		public void setHallTicketNo(long hallTicketNo) {
			this.hallTicketNo = hallTicketNo;
		}

		public String getCollege() {
			return college;
		}

		public void setCollege(String college) {
			this.college = college;
		}

		public Certificate getCertificate() {
			return Certificate;
		}
	
		
	

}
