package com.syntax.class08;

public class ContinueLoop {

	public static void main(String[] args) {
		// continue instead of break
		
		for(int x=1; x<=10; x++) {
			if(x==2) {
				System.out.println("skipping");
				continue;
			}
			
			System.out.println(x);
		}

		System.out.println("i'm out");
		
		
	}

}
