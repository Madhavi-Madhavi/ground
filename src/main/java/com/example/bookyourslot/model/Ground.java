package com.example.bookyourslot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookground_data")
public class Ground {
	//primary key
	@Id
	@GeneratedValue
	@Column(name="SN")
	private int sn;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;

	@Column(name="password")
	private String password;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="comments")
	private String comments;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender + ", phone="
				+ phone + ", comments=" + comments + "]";
	}



}
