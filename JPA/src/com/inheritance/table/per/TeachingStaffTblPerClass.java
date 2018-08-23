package com.inheritance.table.per;

import javax.persistence.Entity;

@Entity 
public class TeachingStaffTblPerClass extends StaffTblPerClass {
    private String qualification;
	private String subjectexpertise;

	public TeachingStaffTblPerClass(int sid, String sname,

			String qualification, String subjectexpertise) {
		super(sid, sname);
		this.qualification = qualification;
		this.subjectexpertise = subjectexpertise;
	}

	public TeachingStaffTblPerClass() {
		super();
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSubjectexpertise() {
		return subjectexpertise;
	}

	public void setSubjectexpertise(String subjectexpertise) {
		this.subjectexpertise = subjectexpertise;
	}
}
