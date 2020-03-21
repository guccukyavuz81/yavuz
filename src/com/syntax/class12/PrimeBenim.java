package com.syntax.class12;

public class PrimeBenim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int x=3; x<50; x++) {
			for(int y=2; y<x; y++) {
				if((x%y==0)){
					continue;
				}	
			}System.out.println(x);
			
			
		}
	}

}
