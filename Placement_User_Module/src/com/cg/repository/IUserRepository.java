package com.cg.repository;

import com.cg.entities.User;

public interface IUserRepository {
	User addNewUser(User user); //add
	User updateUser(User user); // update
	User deleteUser(long id) ; //delete 
	
	public void beginTransaction();//begin the operation of Entity Manager
	 public void commitTransaction();// close an entity manager

}
