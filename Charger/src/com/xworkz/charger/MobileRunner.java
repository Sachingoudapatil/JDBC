package com.xworkz.charger;

public class MobileRunner {

	public static void main(String[] args) {
	
		try {
			Class.forName("com.xworkz.charger.Mobile");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
