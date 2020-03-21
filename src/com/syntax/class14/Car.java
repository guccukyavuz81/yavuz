package com.syntax.class14;

public class Car {

	int year;
	String make;
	String brand;
	
	
	Car(int year, String make, String brand){
		this.year=year;
		this.make=make;
		this.brand=brand;
	}
	
	void display() {
		System.out.println("I was made in  "+make+"  my brand is  "+brand+"  and my year is  "+year);
	}
	
	void reliable() {
		System.out.println(make+"  cars are reliable");
	}
	void noise() {
		System.out.println(brand+"  efsaneydi zamaninda  "+"  yapildigi yer :"+make);
	}
	void mexico() {
		System.out.println(make+" cars in us like "+brand+" are not as good as expected coz they are made in mexico");
	}
	
	
}
