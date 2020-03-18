package com.syntax.class09;

public class ArrayCamAgaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int x=1; x<15; x++) {
			for(int y=1; y<15-x; y++) {
				System.out.print(" ");
			}
			for(int z=1; z<=x*2-1; z++) {
				System.out.print("*");
				
			}
			System.out.println(); 
		}
		
		
		} 
	}


