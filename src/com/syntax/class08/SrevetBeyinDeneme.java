package com.syntax.class08;

public class SrevetBeyinDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= 5; i++) {
        	
            if (i % 2 == 0) {
                sumEven=sumEven+i;
            } else {
                sumOdd= sumOdd+ i;
            }
           
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
	}

}
