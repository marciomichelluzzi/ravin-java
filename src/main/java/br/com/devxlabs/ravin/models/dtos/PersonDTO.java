package br.com.devxlabs.ravin.models.dtos;

import java.io.Serializable;
import java.util.Date;

public class PersonDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private AddressDTO address;
	private String phone;
	private String cpf;
	private Date dateOfBirth;
	private String observations;
	private boolean hasActive;
	

	public PersonDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonDTO(String name, AddressDTO address, String phone, String cpf, Date dateOfBirth, String observations,
			boolean hasActive) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.cpf = cpf;
		this.dateOfBirth = dateOfBirth;
		this.observations = observations;
		this.hasActive = hasActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public boolean isHasActive() {
		return hasActive;
	}

	public void setHasActive(boolean hasActive) {
		this.hasActive = hasActive;
	}

	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", address=" + address + ", phone=" + phone + ", cpf=" + cpf
				+ ", dateOfBirth=" + dateOfBirth + ", observations=" + observations + ", hasActive=" + hasActive + "]";
	}
}
