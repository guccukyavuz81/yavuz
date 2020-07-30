package com.syntax.class17;

public class Repl123 {

	void meth1() {
	System.out.println("Programming is amazing.");
	}
	static void meth2() {
	System.out.println("Java is awesome.");	
	}
	public static void main(String[] args) {
		// Create two methods:
		//The first method should be a non-static method that will print out the following message:
			//"Programming is amazing."
			//The second method should be a static method that will print out the following message:
			//"Java is awesome."
			//Execute both methods
			//Expected Output:
		    //Programming is amazing.
			//Java is awesome.
		Repl123 r=new Repl123();
		r.meth1();
		meth2();
	}

}
