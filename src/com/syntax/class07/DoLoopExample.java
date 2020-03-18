package com.syntax.class07;
import java.util.Scanner;
public class DoLoopExample {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num;
		int sum=0;
		do {
			System.out.println("enter number");
			num=input.nextInt();
			sum=sum+num;	
		}while(num!=0);
		System.out.println(sum);

	}

}
// while checks the condition and then loops,
// do while executes block of code then checks the condition