package com.xworkz.bottle;

public class WaterRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.xworkz.bottle.Water");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}

}
