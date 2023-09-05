package br.com.devxlabs.ravin.models.dtos;

import java.io.Serializable;

public class AddressDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String state;
	private String city;
	private String street;
	private String zipCode;

	public AddressDTO() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "AddressDTO [state=" + state + ", city=" + city + ", street=" + street + ", zipCode=" + zipCode + "]";
	}

}
