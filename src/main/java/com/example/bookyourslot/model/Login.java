package com.example.bookyourslot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_details")
public class Login {
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

	public String getUsernameoremail() {
		return usernameoremail;
	}

	public void setUsernameoremail(String usernameoremail) {
		this.usernameoremail = usernameoremail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="username_or_email")
	private String usernameoremail;

	@Column(name="password")
	private String password;

	@Override
	public String toString() {
		return "Login [sn=" + sn + ", usernameoremail=" + usernameoremail + ", password=" + password + "]";
	}


}
