package com.syntax.class09;

public class Repl83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{1,1,2}, 
				{3,1,2}, 
				{3,5,3}, 
				{0,1,2}  
			};
			
		for(int x=0; x<a.length; x++) {
		int sum=0;
		for(int y=0; y<a[x].length; y++) {
		sum=sum+a[x][y];
			}
		System.out.println(sum);
		}
	}

}
