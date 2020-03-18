package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] table=new int [3][4];
		
	    table[0][0]= 1;
	    table[0][1]= 2;
	    table[0][2]= 3;
	    table[0][3]= 4;
	    table[1][0]= 5;
	    table[1][1]= 6;
	    table[1][2]= 7;
	    table[1][3]= 8;
	    table[2][0]= 9;
	    table[2][1]= 10;
	    table[2][2]= 11;
	    table[2][3]= 12;
	    
	   // for(int x=0; x<table.length; x++) {
	    //	for(int y=0; y<table[x].length; y++) {
	    //		System.out.print(table[x][y]+" ");
	    //	}System.out.println();
	   // }
	
	    for(int [] a:table) {
		for(int b:a) {
			System.out.print(b+" ");
		}System.out.println();
	}
	
	
	
	
	}

}
