package com.syntax.class08;

public class SkipDivisible3 {

	public static void main(String[] args) {
		// 1 to 50 except ones divisible by 3
		int x;
		for(x=1; x<=50; x++) {
			
			if(x%3==0){
				continue;
				
			}System.out.println(x);
		}
		
	}

}
