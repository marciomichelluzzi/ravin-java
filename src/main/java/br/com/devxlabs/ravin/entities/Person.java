package br.com.devxlabs.ravin.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Embedded
	private Address address;
	private String phone;
	
	@Column(nullable = false, unique = true)
	private String cpf;
	private Date dateOfBirth;
	private String observations;
	
	@Column(nullable = false)
	private boolean hasActive;
	
	private boolean test;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, Address address, String phone, String cpf, Date dateOfBirth, String observations,
			boolean hasActive) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.cpf = cpf;
		this.dateOfBirth = dateOfBirth;
		this.observations = observations;
		this.hasActive = hasActive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
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
		return "Person \n id=" + id + ", \n name=" + name + ", \n address=" + address + ", \n phone=" + phone
				+ ", \n cpf=" + cpf + ", \n dateOfBirth=" + dateOfBirth + ", \n observations=" + observations
				+ ", \n hasActive=" + hasActive;
	}

}
