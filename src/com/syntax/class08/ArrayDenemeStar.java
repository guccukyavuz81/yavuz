package com.syntax.class08;

public class ArrayDenemeStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] stars= {{"*","*","*","*","*","*"},
			                {"*","*","*","*","*","*"},
				            {"*","*","*","*","*","*"},
			                {"*","*","*","*","*","*"},
			                {"*","*","*","*","*","*"},
			                {"*","*","*","*","*","*"}};
		
		for(int x=0; x<5; x++) {
			for(int y=0; y<stars[x].length; y++) {
				System.out.print(stars[x][y]+" ");
				
			}
			System.out.println();
			
		}
	}

}
