package com.syntax.class07;

public class HW3 {

	public static void main(String[] args) {

		//PRINT ODD NUMBERS FROM 20 TO 50(2 WAYS)
		
		int num=20;
		while(num<=50) {
			if(num%2==1) {
				System.out.print(num+" ");
			}num++;
			
		}
		//2nd way
		System.out.println("");
		
		for(int num1=20; num1<=50; num1++) {
			if(num1%2==1) {
				System.out.print(num1+" "); 
			}
			
		
			
		}
	}

}
