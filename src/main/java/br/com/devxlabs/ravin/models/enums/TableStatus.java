package br.com.devxlabs.ravin.models.enums;

public enum TableStatus {
	
	RESERVED("RESERVED"),
	OCCUPIED("OCCUPIED"),
	AVAILABLE("AVAILABLE");
	
	private String description = "";

	TableStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
