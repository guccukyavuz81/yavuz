package com.syntax.class09;

public class SumArrayyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] table= {{1, 2, 3, 4},
				        {5, 6, 7, 8},
				        {9,10,11}};
		
		//for(int z[]:table) {
		//for(int v:z) {
				//System.out.print(v+" ");
			//}
		//System.out.println();
		//}
		
		
		
		for(int x=0; x<table.length; x++) {
			for(int y=0; y<table[x].length; y++) {
				System.out.print(table[x][y]+" ");
			}
			System.out.println();
		}
	}
}


