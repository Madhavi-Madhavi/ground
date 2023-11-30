package com.example.bookyourslot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ground_details")
public class Dashboard {
	//primary key
	@Id
	@GeneratedValue
	@Column(name="SN")
	private int sn;
	
	@Column(name="groundname")
	private String groundname;
	
	@Column(name="place")
	private String place;
	 public Dashboard() {
	        // Default constructor
	    }

	public Dashboard(String groundname, String place) {
		// TODO Auto-generated constructor stub
		this.groundname=groundname;
		this.place=place;
	}

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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Dashboard [sn=" + sn + ", groundname=" + groundname + ", place=" + place + "]";
	}
	


}
