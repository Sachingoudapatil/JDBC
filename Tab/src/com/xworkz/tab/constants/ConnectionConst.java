package com.xworkz.tab.constants;

public enum ConnectionConst {
	URL("jdbc:mysql://localhost:3306/tab"), USERNAME("root"), PASSWORD("8748095468");

	private final String value;

	private ConnectionConst(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;
	}

}
