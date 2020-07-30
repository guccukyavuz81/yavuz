package com.syntax.class17;

public class Repl116 {

	int year;
	String school;
	int batch;
	
	void display() {
	System.out.println("I am a student of batch "+batch+" studying at "+school+" in the year of "+year);
	}
	
	
	public static void main(String[] args) {
		// Declare 3 instance variables to hold: year, school name and batch #

//Access variables from the main method and assign specific values to them
//Print values of your variables in the following format:

//Expected Output:
//I am a student of batch 6 studying at Syntax in the year of 2020

		Repl116 r=new Repl116();
		r.batch=6;
		r.school="Syntax";
		r.year=2020;
		r.display();
		
		
		
}

}
