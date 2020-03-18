package com.syntax.class08;

public class OddEvenTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumEven=0;
		int sumOdd=0;
		for(int x=1; x<=99; x++) {
			if(x%2==0) {
				sumEven=sumEven+x;
			}else {
				sumOdd=sumOdd+x;
			}
				
			

		}System.out.println(sumOdd);
		System.out.println(sumEven);
	}

}
