package br.com.devxlabs.ravin.models.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	private String state;
	private String city;
	private String street;
	private String zipCode;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String state, String city, String street, String zipCode) {
		super();
		this.state = state;
		this.city = city;
		this.street = street;
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
