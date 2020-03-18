package com.syntax.class09;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int x=1; x<=9; x++) {
			//System.out.println("I am outer loop");
			for(int y=0; y<=9; y++) {
				//System.out.println("i'm inner loop");
				System.out.println(x+""+y);
				
			}
		}
	}

}
