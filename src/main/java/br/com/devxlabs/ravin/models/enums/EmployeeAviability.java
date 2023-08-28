package br.com.devxlabs.ravin.models.enums;

public enum EmployeeAviability {
	
	BUSY("BUSY"),
	AVAILABLE("AVAILABLE");
	

	private String description = "";

	EmployeeAviability(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
