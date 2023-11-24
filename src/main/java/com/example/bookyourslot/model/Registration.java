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
	
	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	@Column(name="username")
	private String username;
	
	@Column(name="email")
	private String email;

	@Column(name="password")
	private String password;

	@Override
	public String toString() {
		return "Registration [sn=" + sn + ", username=" + username + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	



}
