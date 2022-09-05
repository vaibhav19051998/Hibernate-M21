package com.cg.services;

import com.cg.Repository.IPlacementRepository;
import com.cg.Repository.IPlacementRepositoryImpl;
import com.cg.entities.Placement;


public class IPlacementServicesImpl implements IPlacementServices
{
	private IPlacementRepository dao;
	
	public IPlacementServicesImpl() {
		super();
		dao=new IPlacementRepositoryImpl();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(long id) {
		Placement placement=dao.searchPlacement(id);
		return placement;
	}

	@Override
	public boolean cancelPlacement(long id) {
		dao.beginTransaction();
		@SuppressWarnings("unused")
		boolean res=dao.canclePlacement(id);
		dao.commitTransaction();
		return res;
	}
	
}
