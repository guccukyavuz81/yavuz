package com.syntax.class18;

public class Constrr {

	String make,brand,model;
	int year,doors,wheels;
	Constrr(){
	
	}	
	void display() {
		System.out.println("I was made in "+make+" my brand is "+brand+" my model is "+model+" my year is "+year+" ay hev "+doors+" doors and "+wheels+" wheels");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constrr c=new Constrr();
		c.brand="haci murat";
		c.make="torki";
		c.model="yuzyirmidort";
		c.year=1883;
		c.doors=2;
		c.wheels=3;
		c.display();
		
	}

}
