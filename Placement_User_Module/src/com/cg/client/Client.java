package com.cg.client;

import com.cg.entities.User;
import com.cg.services.IUserServices;
import com.cg.services.IUserServicesImpl;

public class Client {

	public static void main(String[] args) {
		User u=new User();
		IUserServices Is=new IUserServicesImpl();
		u.setId(1011);
		u.setName("Vaibhav");
		u.setPassword("548565");
		u.setType("new User");
		Is.addNewUser(u);
		
		System.out.println("User data add");

	}

}
