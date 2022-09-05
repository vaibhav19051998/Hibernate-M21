package com.cg.Repository;

import com.cg.entities.Placement;

public interface IPlacementRepository {
	Placement addPlacement(Placement placement);
	Placement updatePlacement(Placement placement);
	Placement searchPlacement(long id);
	boolean canclePlacement(long id);
	
	void commitTransaction();
	void beginTransaction();

}
