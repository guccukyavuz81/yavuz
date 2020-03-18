package com.syntax.class09;

public class Repl81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		int y=0;
		int max=0;
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};

		for(x=0; x<a.length; x++) {
			for(y=0; y<a[x].length; y++) {
				if(a[x][y]>max) {
					max=a[x][y];
				}
			}
		}
		System.out.println(max);
		
	}

}
