package br.com.devxlabs.ravin.enums;

public enum Schooling {
	
	ELEMENTARY("ELEMENTARY"),
	HIGH("HIGH"),
	HIGHER("HIGHER");
	
	private String description = "";

	Schooling(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
