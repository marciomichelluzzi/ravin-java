package br.com.devxlabs.ravin.entities;

public class Customer extends Person {
	
	private int customerId;
	private String allergies;
	private boolean vip;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String allergies, boolean vip) {
		super();
		this.customerId = customerId;
		this.allergies = allergies;
		this.vip = vip;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
