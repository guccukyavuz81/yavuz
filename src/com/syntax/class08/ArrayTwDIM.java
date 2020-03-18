package com.syntax.class08;

public class ArrayTwDIM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int table[][]= {{0,1,2,12,15},
                        {3,4,5},
                        {6,7,8,35}};

              for(int x=0; x<3; x++) {
              System.out.println();
              for(int y=0; y<table[x].length; y++)
             System.out.print(table[x][y]+" ");
}
}

}
