package com.syntax.class08;
import java.util.Scanner;
public class SumDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int x;
		int y;
		System.out.println("enter small num");
		x=input.nextInt();
		System.out.println("enter big num");
		y=input.nextInt();
		int sumOdd=0;
		int sumEven=0;
		while(x<=y) {
			if(x%2==0) {
				sumEven=sumEven+x;
			}else {
				sumOdd=sumOdd+x;
			}x++;
		}
		System.out.println(sumOdd+"     "+sumEven);
		
	}

}
