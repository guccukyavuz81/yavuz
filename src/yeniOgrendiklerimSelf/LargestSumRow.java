package yeniOgrendiklerimSelf;

public class LargestSumRow {

	public static void main(String[] args) {
		// find the largest sum in a row
		int max=0;
		int [][] table= {{1,2,3,4},
                         {5,6,7,8},
                         {9,0,1,2}};
		
		for(int x=0; x<table.length; x++) {
			int sum=0;
			for(int y=0; y<table[x].length; y++) {
				sum=sum+table[x][y];
			}
			if(sum>max) {
				max=sum;
			}
		}
		System.out.println(max);
	}

}
//kitaptan bir ornek...kitap biraz farkli cozmus ben soyle yaptim...