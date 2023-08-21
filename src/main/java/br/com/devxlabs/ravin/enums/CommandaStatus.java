package br.com.devxlabs.ravin.enums;

public enum CommandaStatus {
	
	OPEN("OPEN"),
	PAID("PAID"),
	CLOSED("CLOSED");

	private String description = "";

    CommandaStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
	
}
