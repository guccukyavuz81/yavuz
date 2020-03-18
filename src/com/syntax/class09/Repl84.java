package com.syntax.class09;

public class Repl84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int odd=0;
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}};
		
		for(int x=0; x<a.length; x++) {	
		for(int y=0; y<a[x].length; y++) {
			if(a[x][y]<0 && a[x][y]%2!=0){
				odd++;
			}
		}
		
}
	System.out.println(odd);	
}
}
