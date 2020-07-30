package com.syntax.class34;

public class Throws {

	static void div() throws ArithmeticException{
		
		int x=2;
		int y=0;
		int z=x/y;
		System.out.println(z);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			div();
		}catch(ArithmeticException a) {
			System.out.println(a);
		}
		System.out.println("rest of the code");
	}

}
