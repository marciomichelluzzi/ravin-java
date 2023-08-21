package br.com.devxlabs.ravin.enums;

public enum EmployeeAvaiability {
	
	BUSY("BUSY"),
	AVAILABLE("AVAILABLE");
	

	private String description = "";

	EmployeeAvaiability(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
