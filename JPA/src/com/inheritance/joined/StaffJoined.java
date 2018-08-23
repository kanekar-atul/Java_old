package com.inheritance.joined;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)  
public class StaffJoined implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int sid;
	private String sname;

	public StaffJoined() {
		super();
	}

	public StaffJoined(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}