package com.crm.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "address")
public class Address {

	@Id
	private String id;
	
	@Field("city")
	private String city;
	@Field("street")
	private String street;
	@Field("zip")
	private String zip;
	
	public Address(String city, String street, String zip) {
		super();
		this.city = city;
		this.street = street;
		this.zip = zip;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", street=" + street + ", zip=" + zip + "]";
	}
	
}
