package com.xworkz.piller;

public class WorkerRunner {
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName(" com.xworkz.piller.Workers");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
}
}
