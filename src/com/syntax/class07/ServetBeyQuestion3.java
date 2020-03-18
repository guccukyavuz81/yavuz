package com.syntax.class07;
import java.util.Scanner;
public class ServetBeyQuestion3 {

	public static void main(String[] args) {
//print the multiplication table of input number
		
		int num1=1;
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number 1-9");
		num1=input.nextInt();
		int num2=1;
		while(num2<10) {
			int result=num1*num2;
			System.out.println(num1+" * "+num2+" = " +result);
			num2++;
		}
	}

}
