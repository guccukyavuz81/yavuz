package com.syntax.class08;

public class CountBySkipping {

	public static void main(String[] args) {
		// count 1 to 20 skip 6,7,8

		for(int x=1; x<=20; x++) {
			if(x>=6 && x<=8) {
				break;
			}
			
			System.out.println(x);
		}
	}

}
// continue or break has to be inside if condition body