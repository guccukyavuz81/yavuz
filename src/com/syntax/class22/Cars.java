package com.syntax.class22;

public class Cars {

	String make;
	Cars(String make){
	this.make=make;	
	}
	void start() {
		System.out.println(make+" started");
	}
	void display() {
		System.out.println("I am "+make);
	}
	
}
class Mercedes extends Cars{
	Mercedes(String make){
	super(make)	;
	}

	
	
	
}
class Tesla extends Cars{
	Tesla(String make){
		super(make)	;
		}

	
	}
	

class Lexus extends Cars{
	Lexus(String make){
		super(make)	;
		}

	
}
