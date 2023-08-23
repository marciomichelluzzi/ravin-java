package br.com.devxlabs.ravin.enums;

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
