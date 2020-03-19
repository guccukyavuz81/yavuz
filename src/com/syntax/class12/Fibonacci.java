package com.syntax.class12;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		int y=1;
		for(int i=1; i<10; i++) {
		System.out.print(x+" ");	
		int z=x+y;
		x=y;
		y=z;
		}
	}

}
