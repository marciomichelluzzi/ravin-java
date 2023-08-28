package br.com.devxlabs.ravin.models.enums;

public enum Responsibility {
	
	CLEANER("CLEANER"),
	WAITER("WAITER"),
	COOK("COOK"),
	MANAGER("MANAGER");
	
	private String description = "";

	Responsibility(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
