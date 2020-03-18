package com.syntax.class07;
import java.util.Scanner;
public class LoopWithScanner {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		String name;
		int num=1;
		
		while(num<=5) {
			System.out.println("you name?");
			name=input.nextLine();
			System.out.println("good afternoon "+name);
			num++;
		}
		
		
		
		
		
		
		
		
		
	}

}
