package com.syntax.class08;
import java.util.Scanner;
public class LoopsRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int price;
		
		do {
			System.out.println("pay");
			price=input.nextInt();
		}while(price!=2);
		System.out.println("enjoy");
	}

}
 