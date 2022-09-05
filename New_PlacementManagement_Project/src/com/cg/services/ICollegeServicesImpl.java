package com.cg.services;

import com.cg.entities.College;
import com.cg.repository.ICollegeRepository;
import com.cg.repository.ICollegeRepositoryImpl;


public class ICollegeServicesImpl implements ICollegeServices
{
	private ICollegeRepository cr;
	
	public ICollegeServicesImpl() {
		cr=new ICollegeRepositoryImpl();
	}

	@Override
	public College addCollege(College college) {
		cr.beginTransaction();
		cr.addCollege(college);
		cr.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		cr.beginTransaction();
		cr.updateCollege(college);
		cr.commitTransaction();
		return null;
	}

	@Override
	public College searchCollege(long id) {
		College college=cr.searchCollege(id);
		return college;
	}

	@Override
	public boolean deleteCollege(long id) {
		cr.beginTransaction();
		boolean res=cr.deleteCollege(id);
		cr.commitTransaction();
		return res;
	}

	

	

}
