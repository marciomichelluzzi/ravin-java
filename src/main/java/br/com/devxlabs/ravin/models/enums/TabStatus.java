package br.com.devxlabs.ravin.models.enums;

public enum TabStatus {
	
	OPEN("OPEN"),
	PAID("PAID"),
	CLOSED("CLOSED");

	private String description = "";

    TabStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
	
}
