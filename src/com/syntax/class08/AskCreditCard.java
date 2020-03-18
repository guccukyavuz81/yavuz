package com.syntax.class08;
import java.util.Scanner;
public class AskCreditCard {

	public static void main(String[] args) {
		// ask to apply for credit card 10 times then stop when yes

		
		
		for(int times=1; times<=10; times++) {
			Scanner input=new Scanner(System.in);
			String answer=null;
			System.out.println("want credit card");
			answer=input.nextLine();
			if(answer.equals("yes")) {
				System.out.println("here it is");
				break;
			}
			
			
			
		}
	}

}
