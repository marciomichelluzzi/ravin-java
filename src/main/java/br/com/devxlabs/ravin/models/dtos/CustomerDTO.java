package br.com.devxlabs.ravin.models.dtos;

import java.io.Serializable;

public class CustomerDTO extends PersonDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String allergies;
	private boolean vip;

	public CustomerDTO() {
		// TODO Auto-generated constructor stub
	}

	public CustomerDTO(String allergies, boolean vip) {
		super();
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
		return "CustomerDTO [allergies=" + allergies + ", vip=" + vip + "]";
	}

}
