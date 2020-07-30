package com.syntax.class17;

public class Repl121 {

	static int x;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare a static variable number that will hold an integer value:
			//Access number from the main method and assign value to it.
			//Create an Object of the class, access number in a nonstatic way and assing value of 200.
			//Print out number using class name and using instance
			//Expected Output:
			//200
			//200
		
		x=200;
		Repl121 r=new Repl121();
		r.x=200;
		System.out.println(Repl121.x);
		System.out.println(r.x);
		
	}

}
