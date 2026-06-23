package com.student.entity;

import jakarta.persistence.*;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private String state;
	private String pincode;
	private String city;

	public Address() {

	}

	public Address(String state, String pincode, String city) {
		this.state = state;
		this.pincode = pincode;
		this.city = city;
	}

	// public Address(String state2, String pincode2, String city2) {
	// // TODO Auto-generated constructor stub
	// }

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}