package com.syntax.class08;
import java.util.Scanner;
public class WhileCandy {

	public static void main(String[] args) {
		// while instead of do while

		int price=0;
		Scanner input=new Scanner(System.in);
		
		while(price!=2) {
			System.out.println("pay");
			price=input.nextInt();
			
		}
		System.out.println("enjoy");
	}

}
