package com.cg.client;

import com.cg.entities.Admin;
import com.cg.services.IAdminServices;
import com.cg.services.IAdminServicesImpl;

public class Client {

	public static void main(String[] args) {
		IAdminServices services=new IAdminServicesImpl();
		Admin a=new Admin();
		
		a.setId(15);
		a.setName("Rohan");
		a.setPassword("1236541");
		
		services.addAdmin(a);

		System.out.println("data is added");
	}

}
