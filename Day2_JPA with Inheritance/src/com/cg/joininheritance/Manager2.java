package com.cg.joininheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MGR_Table2")

public class Manager2 extends Employee2
{
	private static final long serialVersionUID=1L;
	private String deptName;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

}


