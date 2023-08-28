package br.com.devxlabs.ravin.models.dtos;

public class CustomerDTO extends PersonDTO {

	private int id;
	private String allergies;
	private boolean vip;

	public CustomerDTO() {
		// TODO Auto-generated constructor stub
	}

	public CustomerDTO(int id, String allergies, boolean vip) {
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
