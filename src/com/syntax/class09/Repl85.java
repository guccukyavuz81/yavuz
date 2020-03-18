package com.syntax.class09;

public class Repl85 {

	public static void main(String[] args) {
		// Write a program that sums all numbers that are on even index and on even row.


		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		int sum=0;
		for(int x=0; x<a.length; x++) {	
			for(int y=0; y<a[x].length; y++) {
			if((x%2==0)&&(y%2==0)) {
			sum=sum+a[x][y];
			
			}
			}
				
	}System.out.println(sum);
	}
}
