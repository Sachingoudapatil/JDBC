package com.xworkz.switches;

public class BoardRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("running");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Class.forName("com.xworkz.switches.Board");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}

	}

}
