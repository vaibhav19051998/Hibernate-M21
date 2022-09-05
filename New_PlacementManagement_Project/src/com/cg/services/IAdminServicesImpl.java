package com.cg.services;

import java.util.Scanner;

import com.cg.Repository.IAdminRepositoryImpl;
import com.cg.entities.Admin;

public class IAdminServicesImpl implements IAdminServices
{
	//Establishing connection between service and repository
	private IAdminRepositoryImpl uao;
	
	Scanner s=new Scanner(System.in);
		
		//constructor
		public IAdminServicesImpl() 
		{
			uao=new IAdminRepositoryImpl();
		}
		
	//Service calls to perform CRUD Operation
	@Override
	public Admin addNewAdmin(Admin admin) 
	{
		uao.beginTransaction();
		uao.addNewAdmin(admin);
		uao.commitTransaction();
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) 
	{System.out.println("Enter the admin name:");
	String uname=s.nextLine();
	System.out.println("Enter the Password :");
	String upsw=s.nextLine();
	if(uname==admin.getName() && upsw==admin.getPassword()) {
		return admin;
}

else 
{
	System.out.println("Invalid admin name or password :");
	return null;
}

}

	@Override
	public Admin login(Admin admin) 
	{
		System.out.println("Enter the admin name:");
		String uname=s.nextLine();
		System.out.println("Enter the Password :");
		String upsw=s.nextLine();
		if(uname==admin.getName() && upsw==admin.getPassword()) {
			return admin;
	}
	
	else 
	{
		System.out.println("Invalid admin name or password :");
		return null;
	}
	}

	@Override
	public boolean logout() {
		System.exit(0);
		return true;
	}
	
}
