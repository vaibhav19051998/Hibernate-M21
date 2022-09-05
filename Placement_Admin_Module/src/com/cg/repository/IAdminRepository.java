package com.cg.repository;

import com.cg.entities.Admin;

public interface IAdminRepository 
{
	Admin addAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin searchAdmin(int id);
	
	
	void commitTransaction();
	void beginTransaction();

}
