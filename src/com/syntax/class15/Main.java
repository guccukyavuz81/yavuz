package com.syntax.class15;
//Create a method with the following specs:  

//Returns:
//an integer
//Name:
//sumEvenToX
//Parameters:
//an integer called "x"
//Purpose:
//calculate the sum of the EVEN integers from 1 to x (including x)

//Examples:
//sumEvenToX(5) ==> 6
//sumEvenToX(8) ==> 20


public class Main {
	
	int sumEvenToX(int x) {
		int sum=0;
		int y=0;
		
		for(y=1; y<=x; y++) {
			if(y%2==0) {	
			sum	=sum+y;	
			}
		}
		return sum;	
	}
	
	public static void main(String[] args) {
		Main q=new Main();
		System.out.println(q.sumEvenToX(5));
		System.out.println(q.sumEvenToX(8));

	}
	
	
	
}