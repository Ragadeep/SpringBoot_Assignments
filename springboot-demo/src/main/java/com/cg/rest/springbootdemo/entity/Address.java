package com.cg.rest.springbootdemo.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String flatno;
	private String name;
	private String city;
	private String street;
	private String pincode;
	
	public Address() {
		super();
	}
	
	

	public Address(String flatno, String name, String city, String street, String pincode) {
		super();
		this.flatno = flatno;
		this.name = name;
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}



	public String getFlatno() {
		return flatno;
	}

	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", name=" + name + ", city=" + city + ", street=" + street + ", pincode="
				+ pincode + "]";
	}
	
}
