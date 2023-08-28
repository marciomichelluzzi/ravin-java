package br.com.devxlabs.ravin.models.enums;

public enum MeritalStatus {
	
	SINGLE("SINGLE"),
	MARRIED("MARRIED"),
	WIDOVED("WIDOVED"),
	DIVORCED("DIVORCED"),
	SEPARATE("SEPARATE");
	
	private String description = "";

	MeritalStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
