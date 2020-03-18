package com.syntax.class09;

public class StarIncDecPattrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int x=1; x<=5; x++) {
            
			for(int y=1; y<=x; y++) {
				System.out.print("* ");	
	        }
			System.out.println();
	
}
		for(int x=1; x<=10 ; x++) {
            //even x=10 or 100 still gives the same output coz it stops when cond is false
			for(int y=4; y>=x; y--) {
				System.out.print("* ");	
	        }
			System.out.println();
	}
	}
}
