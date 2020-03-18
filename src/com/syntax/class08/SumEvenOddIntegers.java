package com.syntax.class08;
import java.util.Scanner;
public class SumEvenOddIntegers {

	public static void main(String[] args) {
		// ask a range of integers print the sum of even and odd

		Scanner input=new Scanner(System.in);
		int num;
		int sumOdd=0;
		int sumEven=0;
		System.out.println("enter numbers 1 to 10");
		num=input.nextInt();
		while(num>=1 && num<=10) {
			if(num%2==0) {
				sumEven=sumEven+num;
			}else {
				sumOdd=sumOdd+num;
			}
			
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
		
		//bu benim deneme
	}

}
