package com.syntax.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {

		int num=1;
		while(num<=5) {
			System.out.println("hi");
			num++;
		}
		//doesn't get into the code unless true
		System.out.println("doing with do while.......");
		
		int num1=1;
		do {
			System.out.println("hi");
			num1++;
			
		}while(num1<=5);
		System.out.println("i'm out");
		//executes at least once and comes to the while checks if not true stops
	}

}
