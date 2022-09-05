package com.cg.client;

import com.cg.entities.Placement;
import com.cg.services.IPlacementServices;
import com.cg.services.IPlacementServicesImpl;

public class Client {

	public static void main(String[] args) {
		IPlacementServices service =new IPlacementServicesImpl();
		Placement p=new Placement ();
		
		p.setId(1515);
		p.setName("VAibhav");
		p.setQualification("BE");
		p.setYear(2022);
		service.addPlacement(p);
		
		
		
		
	}

}
