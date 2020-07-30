package com.syntax.class17;

public class Repl118 {

	String name;
	String capital;
	long population;
	
	void display() {
	System.out.println("The capital of "+name+" is "+capital+" and population is "+population);
	}
	
	
	
	
	public static void main(String[] args) {
		// Declare 3 instance variables to hold:name of the country       capital     population size
     //Create a method to display values of instance variables
//Create 2 Object, assign values to instance variables, execute method display;
//Expected Output:
//The capital of USA is Washington DC and population is 330000000
//The capital of Kazakhstan is Astana and population is 18500000

		Repl118 r=new Repl118();
		Repl118 p=new Repl118();
		r.name="USA";
		r.capital="Washington DC";
		r.population=330000000l;
		p.name="Kazakhstan";
		p.capital="Astana";
		p.population=18500000l;
		r.display();
		p.display();

	}

}
