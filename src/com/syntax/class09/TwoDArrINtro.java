package com.syntax.class09;

public class TwoDArrINtro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] table= {{10,20,30,40},
				          {15,10,15,20},
				          {11, 22, 33, 44}};
		
		for(int x=0; x<table.length; x++) {
			System.out.println();
			for(int y=0; y<table[x].length; y++) {
				System.out.print(table[x][y]+" ");
				
				
			}
		}
		
	}

}
