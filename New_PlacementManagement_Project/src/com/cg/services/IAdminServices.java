package com.cg.services;

import com.cg.entities.Admin;

public interface IAdminServices {
	Admin addNewAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin login(Admin admin);
	boolean logout();


}
