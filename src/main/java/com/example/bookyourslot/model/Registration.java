package com.example.bookyourslot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registration_details")
public class Registration {
	//primary key
	@Id
	@GeneratedValue
	@Column(name="SN")
	private int sn;
	
	@Column(name="groundname")
	private String groundname;
	
	@Column(name="place")
	private String place;

	@Column(name="mobilenumber")
	private String mobilenumber;

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

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@Override
	public String toString() {
		return "Registration [sn=" + sn + ", groundname=" + groundname + ", place=" + place + ", mobilenumber="
				+ mobilenumber + "]";
	}
}
