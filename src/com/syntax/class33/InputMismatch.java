package com.syntax.class33;
import java.util.Scanner;
public class InputMismatch {

	public static void main(String[] args) {
// How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value then programmer expected.


		Scanner input=new Scanner(System.in);
		
		System.out.println("enter number");
		try {
			int x=input.nextInt();	
		}catch(Exception im) {
			System.out.println("exception ocurred is "+im);
		}
		System.out.println("rest of the code");
		
	}

}
