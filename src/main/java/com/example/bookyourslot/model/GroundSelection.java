package com.example.bookyourslot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ground_selection")
public class GroundSelection {
	//primary key
	@Id
	@GeneratedValue
	@Column(name="SN")
	private int sn;
	
	@Column(name="groundname")
	private String groundname;

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public String getGroundname() {
		return groundname;
	}

	public void setGroundname(String groundname) {
		this.groundname = groundname;
	}

	@Override
	public String toString() {
		return "GroundSelection [sn=" + sn + ", groundname=" + groundname + "]";
	}

}
