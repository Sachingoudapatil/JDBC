package com.xworkz.switches;

public class BoardRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.xworkz.switches.Board");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}

	}

}
