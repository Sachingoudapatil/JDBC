package com.xworkz.colour.constants;

public enum ColourConnection {
	URL("jdbc:mysql://localhost:3306/colour"), USERNAME("root"), PASSWORD("8748095468");

	private final String value;

	private ColourConnection(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;
	}
}
