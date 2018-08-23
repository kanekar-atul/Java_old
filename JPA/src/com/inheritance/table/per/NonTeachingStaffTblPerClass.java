package com.inheritance.table.per;

import javax.persistence.Entity;

@Entity 
public class NonTeachingStaffTblPerClass extends StaffTblPerClass {
	private String areaexpertise;

	public NonTeachingStaffTblPerClass(int sid, String sname, String areaexpertise) {
		super(sid, sname);
		this.areaexpertise = areaexpertise;
	}

	public NonTeachingStaffTblPerClass() {
		super();
	}

	public String getAreaexpertise() {
		return areaexpertise;
	}

	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}
}