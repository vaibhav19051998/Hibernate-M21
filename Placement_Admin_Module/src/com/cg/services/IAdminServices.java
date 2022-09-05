package com.cg.services;

import com.cg.entities.Admin;

public interface IAdminServices 
{
	Admin addAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	Admin searchAdmin(int id);

}
