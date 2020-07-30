package com.syntax.class33;

public class ArithmeticExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int i = 10;
			int j;
			j = i/0 ; // It will throw exception
			}catch (Exception a){
			// Print the exception
			System.out.println(a);
			System.out.println("Unhandled Exception");
			}
	}

}
