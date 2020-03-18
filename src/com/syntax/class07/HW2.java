package com.syntax.class07;

public class HW2 {

	public static void main(String[] args) {
//even numbers from 20 to 1
		int num=20;
		while(num>=1) {
			if(num%2==0) {
				System.out.print(num+" ");
			}num--;
		}
		System.out.println(" ");
		
		//2nd way
		
				for(int num1=20; num1>=1;  num1--) {
					if(num1%2==0) {
						System.out.print(num1+" ");	
					}
					
				}
		
	}
}
