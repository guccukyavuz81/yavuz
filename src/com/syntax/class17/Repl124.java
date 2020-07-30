package com.syntax.class17;

public class Repl124 {

	static String country;
	static String continent;
	void display() {
		System.out.println(country+" located on "+continent+" continent");
	}
	public static void main(String[] args) {
		// Declare two static variables to hold
		//country name
		//continent
		//Create a method to display the value of static variables in the following format:
		//____ located on ____ continen
		//In the main method assign values to a static variable and execute method display
		//Expected Output:
		//Morocco located on Africa continent

		Repl124 r=new Repl124();
		country="Morocco";
		continent="Africa";
		r.display();
	}

}
