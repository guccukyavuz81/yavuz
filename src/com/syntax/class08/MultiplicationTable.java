package com.syntax.class08;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int x,y,mul;
		System.out.println("enter number x");
		x=input.nextInt();
		
		for(y=1; y<=9; y++) {
			mul=x*y;
			System.out.println(x+ "*" +y+ "=" +mul);
		}
	}

}
