package com.syntax.class11;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=1;
		int y=1;
		
		for(x=1; x<10; x++) {
			int z=x+y;
			y=z;
			x=y;
			System.out.print(z+" ");
		}
	}

}
