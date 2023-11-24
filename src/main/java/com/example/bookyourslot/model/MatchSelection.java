package com.example.bookyourslot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="match_selection")
public class MatchSelection {
	//primary key
	@Id
	@GeneratedValue
	@Column(name="SN")
	private int sn;
	
	@Column(name="match_type")
	private String matchtype;
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column(name="date")
	private String date;
	

	public String getMatchtype() {
		return matchtype;
	}

	public void setMatchtype(String matchtype) {
		this.matchtype = matchtype;
	}

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	@Override
	public String toString() {
		return "MatchSelection [sn=" + sn + ", matchtype=" + matchtype + ", date=" + date + "]";
	}

	

}
