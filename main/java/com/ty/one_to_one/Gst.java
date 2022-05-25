package com.ty.one_to_one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gst {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int gstNumber;
	private String state;
	private String county;
	@OneToOne
	private Company company;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(int gstNumber) {
		this.gstNumber = gstNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
}
