package com.cg.services;

import com.cg.entities.Certificate;
import com.cg.entities.Student;

public interface IStudentServices 
{

	public Student  addStudent(Student std);
	public Student updateStudent(Student std);
	public Student searchStudentById(long id);
	public boolean addCertificate(Certificate certificate);
	public boolean deleteStudent(long id);
	public Student searchStudentByHallTicket(long ticketNo);
	public boolean updateCertificate(Certificate certificate);
	
	
}
