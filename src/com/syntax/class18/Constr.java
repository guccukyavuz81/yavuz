package com.syntax.class18;

public class Constr {

	String make,brand,model;
	int year;
	Constr(String ma,String br, String mo, int y){
	make=ma;
	brand=br;
	model=mo;
	year=y;
	}
	void display() {
	System.out.println("I was made in "+make+" my brand is "+brand+" my model is "+model+" my year is "+year);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constr c=new Constr("Japan","Toyota","Camry",2011);
		c.display();
	}

}
