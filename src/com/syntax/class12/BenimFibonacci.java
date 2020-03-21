package com.syntax.class12;

public class BenimFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		int y=1;
		
		
		for(int w=1; w<=10; w++) {
		System.out.print(x+" ");	
		int z=x+y;
		//y=z;   0 1 2 4 8 16 32 64 128 256  basiyor burda olunca
		x=y;	
		y=z;	
			
		}
		
	}

}
