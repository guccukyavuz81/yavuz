package com.syntax.class07;
import java.util.Scanner;
public class ServetBeyQuestion5 {

	public static void main(String[] args) {

		//write a program to find the value of one number raised to another
		
		Scanner input=new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("enter first number");
		num1=input.nextInt();
		System.out.println("enter second number");
		num2=input.nextInt();
		//int x;
		//int result=1;
		//for(x=1; x<=num2; x++) {
		//	result=result*num1;
		int result=1;
		int	x=1;
		while(x<=num2) {
			result=result*num1;
			x++;
		}
		System.out.println(result);
		
	}

}
