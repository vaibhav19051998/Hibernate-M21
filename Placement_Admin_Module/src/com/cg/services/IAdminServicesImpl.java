package com.cg.services;

import com.cg.entities.Admin;
import com.cg.repository.IAdminRepository;
import com.cg.repository.IAdminRepositoryImpl;

public class IAdminServicesImpl implements  IAdminServices
{
	private IAdminRepository ar;
	

	public IAdminServicesImpl() {
		super();
		ar=new IAdminRepositoryImpl();
	}

	@Override
	public Admin addAdmin(Admin admin) {
		ar.beginTransaction();
		ar.addAdmin(admin);
		ar.commitTransaction();
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		ar.beginTransaction();
		ar.updateAdmin(admin);
		ar.commitTransaction();
		return admin;
	}

	@Override
	public Admin searchAdmin(int id) {
		Admin admin=ar.searchAdmin(id);
		return admin;
	}
	

}
