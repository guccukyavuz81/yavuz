package com.syntax.class08;
import java.util.Scanner;
public class HocaninSumOddEven {

	public static void main(String[] args) {
		// hocanin cozum videodan tamamla
		
		int sumEven=0;
		int sumOdd=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter two numbers");
		int min=input.nextInt();
		int max=input.nextInt();
		
		for(int x=min; x<=max; x++) {
			if(x%2==0) {
				sumEven=sumEven+x;
				
			}else {
				sumOdd=sumOdd+x;
			}
			
			
		}System.out.println(sumOdd);
		System.out.println(sumEven);

		
	}

}
