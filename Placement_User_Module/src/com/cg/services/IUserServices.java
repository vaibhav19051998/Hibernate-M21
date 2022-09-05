package com.cg.services;

import com.cg.entities.User;

public interface IUserServices {
	User addNewUser(User user) ; 
	User updateUser(User user) ; 
	//User login(User user); 
	boolean logOut();
}
