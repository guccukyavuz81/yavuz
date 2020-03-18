package com.syntax.class07;
import java.util.Scanner;
public class ServetBeyQuestion6 {

	public static void main(String[] args) {
		// ask for 5 digit number and reverse it

		Scanner input=new Scanner(System.in);
		int reversed=0;
		System.out.println("pls enter 5 digits");
		int num=input.nextInt();
		
		while(num!=0) {
		int digit=num%10;
	    reversed=reversed*10+digit;
	    num/=10;
		}
		
			
		
		//for(;num%10 !=0) {
		//	reversed=reversed*10;
			
			
			
		
	}

}
