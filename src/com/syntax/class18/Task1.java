package com.syntax.class18;

class Cons{
	
	Cons(){
		System.out.println("without parameter");
	}
	Cons(int x){
		System.out.println("with "+x+"st parameter");
	}
}

public class Task1 {

	public static void main(String[] args) {
		// Write a program that will have a constructor: one with parameters and second without any parameters. 
		//Create a separate Test class where you will execute both of the constructors.

		Cons c=new Cons();
		Cons d=new Cons(1);
	}
}
