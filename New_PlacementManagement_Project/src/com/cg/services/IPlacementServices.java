package com.cg.services;

import com.cg.entities.Placement;

public interface IPlacementServices {
	Placement addPlacement(Placement placement);
	Placement updatePlacement(Placement placement);
	Placement searchPlacement(long id);
	boolean cancelPlacement(long id);
}
