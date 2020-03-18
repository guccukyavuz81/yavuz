package com.syntax.class08;

public class BayramgulTwoDimPRactice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int table[][]= {{0,1,2},
		              //  {3,4,5},
		              //  {6,7,8}};
		
		//for(int x=0; x<3; x++) {
			//System.out.println(table[x][x]);
		//}
		
		String day[][] = {{"mon","tue","wed"},
				          {"sun","rain","snow","whoknows"}};
		int x,y=0;
		for(x=0; x<day.length; x++) {
			System.out.println();
			for(y=0; y<day[x].length; y++) {
				System.out.print(day[x][y]+" ");
				//System.out.println();

			}
			
		}
		
	}
}

