package com.example.bookyourslot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "preview_details")
public class PreviewDetails {
	// primary key
	@Id
	@GeneratedValue
	@Column(name = "SN")
	private int sn;

	@Column(name = "matchtype")
	private String matchtype;
	
	@Column(name = "date")
	private String date;

	@Column(name = "timeslot")
	private String timeslot;

	@Column(name = "groundname")
	private String groundname;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "gender")
	private String gender;

	@Column(name = "phone")
	private String phone;

	@Column(name = "city")
	private String city;

	@Column(name = "comments")
	private String comments;

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public String getMatchtype() {
		return matchtype;
	}

	public void setMatchtype(String matchtype) {
		this.matchtype = matchtype;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTimeslot() {
		return timeslot;
	}

	public void setTimeslot(String timeslot) {
		this.timeslot = timeslot;
	}

	public String getGroundname() {
		return groundname;
	}

	public void setGroundname(String groundname) {
		this.groundname = groundname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "PreviewDetails [sn=" + sn + ", matchtype=" + matchtype + ", date=" + date + ", timeslot=" + timeslot
				+ ", groundname=" + groundname + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ ", phone=" + phone + ", city=" + city + ", comments=" + comments + ", getSn()=" + getSn()
				+ ", getMatchtype()=" + getMatchtype() + ", getDate()=" + getDate() + ", getTimeslot()=" + getTimeslot()
				+ ", getGroundname()=" + getGroundname() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ ", getGender()=" + getGender() + ", getPhone()=" + getPhone() + ", getCity()=" + getCity()
				+ ", getComments()=" + getComments() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	

}
