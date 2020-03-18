package com.syntax.class08;

public class FibonacciNumForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int x=0;
		int y=1;
		int z=20;
		for(int w=1; w<=z; w++) {
		
		System.out.print(x+" ");
		int sumXY=x+y;
		x=y;
		y=sumXY;
		}
	}

}
