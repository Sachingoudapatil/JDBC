package com.xworkz.food.constants;

public enum FoodConnection {
	URL("jdbc:mysql://localhost:3306/food"), USERNAME("root"), PASSWORD("8748095468");

	private final String value;

	private FoodConnection(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;
	}
}
