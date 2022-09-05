package com.cg.Repository;

import com.cg.entities.College;

public interface ICollegeRepository {
	College addCollege(College college);
	College updateCollege(College college);
	College searchCollege(int id);
	boolean deleteCollege(int id);
	
	void beginTransaction() ;
	void commitTransaction();

}
