package com.cg.client;

import java.time.LocalDate;

import com.cg.entities.Admin;
import com.cg.entities.Certificate;
import com.cg.entities.College;
import com.cg.entities.Placement;
import com.cg.entities.Student;
import com.cg.entities.User;
import com.cg.services.IAdminServices;
import com.cg.services.IAdminServicesImpl;
import com.cg.services.IPlacementServices;
import com.cg.services.IPlacementServicesImpl;
import com.cg.services.IStudentServices;
import com.cg.services.IStudentServicesImpl;


public class Client {

	public static void main(String[] args) {
		 //Lazy initialization
		Student s=new Student();
		IStudentServices Service = new IStudentServicesImpl();
		
		s.setId(101);
		s.setName("Rohan");
		s.setRoll(10);
		//s.setCollege("JSCOE");
		s.setQualification("BE");
		s.setCourse("E&TC");
		s.setYear(2021);
		s.setHallTicketNo(717113);
		
		//----certificate
		Certificate c = new Certificate();
		c.setId(201);
		c.setYear(2022);
		
		//Adding certificate and student
		s.setCertificate(c);
		c.setStudent(s);
		
		//Adding column
		Service.addCertificate(c);
		
				//Display output for student table
				System.out.println("Student Id is: "+s.getId());
				System.out.println("Student name is: " +s.getName());
				System.out.println("Student Roll no. is: "+s.getRoll());
				System.out.println("Student Qualification Id is: "+s.getQualification());
				System.out.println("Student Course is: "+s.getCourse());
				System.out.println("Student Year is: "+s.getYear());
				System.out.println("Student College is: "+s.getCollege());
				System.out.println("Student Hall ticket is: "+s.getHallTicketNo());
				//Displaying output for certificate table
				System.out.println("Certificate Id is: "+c.getId());
				System.out.println("Certificate Year is: "+c.getYear());
				
				//College input 
				College C=new College();
				C.setId(4040);
				C.setCollegeName("JSPM");
				C.setLocation("Hadapsar");
				
				//Placement input
				Placement p=new Placement();
				IPlacementServices placement =new IPlacementServicesImpl();
				p.setId(1515);
				p.setName("Jscoe Placement Group");
				p.setQualification("BE");
				p.setYear(2022);
				p.setCollege(C);
				LocalDate date=LocalDate.now();
				p.setDate(date);
				placement.addPlacement(p);
				
				//set method for college 
				C.setCollegeName("PCCOE");
				//Add Placement
				placement.addPlacement(p);
				
				//for college table
			    System.out.println("College Id is: "+C.getId());
				System.out.println("College Name is: "+C.getCollegeName());
				System.out.println("College Location is : "+C.getLocation());
				
				//for placement table
				System.out.println("Placement Id is: "+p.getId());
				System.out.println("Placement Date is: "+p.getDate());
				System.out.println("Placement Qualification is: "+p.getQualification());
				System.out.println("Placement Year is: "+p.getYear());
				System.out.println("Placement Name is: "+p.getName());
				System.out.println("Placement College is: "+p.getCollege());
				
				//For User
				User u=new User();
				u.setId(1010);
				u.setName("Ishwar");
				u.setPassword("14525");
				u.setType("new User");
				
				//Admin input 
				Admin a=new Admin();
				IAdminServices ad=new IAdminServicesImpl();
				a.setId(4585);
				a.setName(" Omkar ");
				a.setPassword("omkar45345");
						
				//Set methods for User and Admin
				u.setAdmin(a);
				a.setUser(u);
						
				//Adding data
				ad.addNewAdmin(a);
				
				//for User table
			    System.out.println("User ID is : " +u.getId());
				System.out.println("User Name is: "+u.getName());
				System.out.println("User Type is : "+u.getType());
				System.out.println("User Password is : "+u.getPassword());
				
				
				//Displaying output for admin table
				System.out.println("Admin ID is : " +a.getId());
				System.out.println("Admin Name is: "+a.getName());
				System.out.println("Admin Password is : "+a.getPassword());
			  
				
			
				System.out.println(" ");
				System.out.println("Data is inserted successfully");
				
				
			    
			    System.out.println(" ");
				System.out.println("Data Updated successfully");
}
}
