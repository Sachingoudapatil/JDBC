package com.xworkz.scholarshipform.constants;

public enum ScholarshipConnection {
	URL("jdbc:mysql://localhost:3306/scholarship"), USERNAME("root"), PASSWORD("8748095468");

	private final String value;

	private ScholarshipConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
