package yeniOgrendiklerimSelf;

public class TwoDArryPRC {

	public static void main(String[] args) {
		// find the sum of the numbers in the column

		int x=0;
		int y=0;
		int [][] table= {{1,2,3,4},
				         {5,6,7,8},
		                 {9,0,1,2}};
		
		
		for(x=0; x<table[0].length; x++) {
			int sum=0;
			for(y=0; y<table.length; y++) {
				sum=sum+table[y][x];
			}
			System.out.println("sum of column "+x+" is "+sum);
		}
		 
}

}
