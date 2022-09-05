package com.cg.services;

import com.cg.entities.User;
import com.cg.repository.IUserRepository;
import com.cg.repository.IUserRepositoryImpl;

public class IUserServicesImpl implements IUserServices {

	//1: Establishing connection
	private IUserRepository us;
	//constructor
	public IUserServicesImpl()
		{
			super();
			us =new IUserRepositoryImpl();
					
		}
	
	@Override
	public User addNewUser(User user) {
		us.beginTransaction();
		us.addNewUser(user);
		us.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		us.beginTransaction();
		us.updateUser(user);
		us.commitTransaction();
		return user;
	}

	/*@Override
	public User login(User user) {
		us.beginTransaction();
		
		us.commitTransaction();
		return user;
	}*/

	@Override
	public boolean logOut() {
		System.exit(0);
		return true;
	}


}
