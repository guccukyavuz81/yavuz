package com.syntax.class09;

public class TwoDimMonthsArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] months= {{"dec","jan","feb"},
				            {"mar","apr","marc"},
				            {"jun","jul","aug"},
				            {"sep","oct","nov"}};
		
		for(int x=0; x<4; x++) {
		//System.out.println(); burada da arayi veriyo asagida yazmak daha mantikli inner loop un disinda
		for(int y=0; y<months[x].length; y++) {
		System.out.print(months[x][y]+" ");
			//}
		//System.out.println(months[1].length);
	}
		System.out.println();
		}
}
}