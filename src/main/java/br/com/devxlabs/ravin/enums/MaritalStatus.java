package br.com.devxlabs.ravin.enums;

public enum MaritalStatus {

	SINGLE("SINGLE"),
	MARRIED("MARRIED"),
	WIDOWED("WIDOWED"),
	DIVORCED("DIVORCED"),
	SEPARATE("SEPARATE");

	private String description = "";

	MaritalStatus(String description) {
		this.description = description;
	}

	public String getDescription() {
        return description;
    }
}
