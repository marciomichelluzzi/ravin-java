package br.com.devxlabs.ravin.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer extends Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String allergies;
	private boolean vip;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String allergies, boolean vip) {
		super();
		this.id = id;
		this.allergies = allergies;
		this.vip = vip;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		return "Customer [allergies=" + allergies + ", vip=" + vip + "]";
	}
}
