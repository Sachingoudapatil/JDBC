package com.xworkz.library.constants;

public enum LibraryConnection {
	URL("jdbc:mysql://localhost:3306/library"), USERNAME("root"), PASSWORD("8748095468");

	private final String value;

	private LibraryConnection(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;
	}
}
