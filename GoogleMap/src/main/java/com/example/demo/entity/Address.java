package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "AddressDatabase")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressId", unique = true, nullable = false)
	int addressId;  
	
	@Column(name = "addressLine")
	String addressLine; 
	
	@Column(name = "locality")
	String locality;
	
	@Column(name = "city")
	String city;
	
	@Column(name = "district")
	String district;
	
	@Column(name = "state")
	String state;
	
	@Column(name = "country")
	String country;
	
	@Column(name = "pincode")
	int pincode;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Address(int addressId, String addressLine, String locality, String city, String district, String state,
			String country, int pincode) {
		super();
		this.addressId = addressId;
		this.addressLine = addressLine;
		this.locality = locality;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public Address() { }

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLine=" + addressLine + ", locality=" + locality + ", city="
				+ city + ", district=" + district + ", state=" + state + ", country=" + country + ", pincode=" + pincode
				+ "]";
	}

}