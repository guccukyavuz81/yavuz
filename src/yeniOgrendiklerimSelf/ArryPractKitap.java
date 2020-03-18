package yeniOgrendiklerimSelf;

public class ArryPractKitap {

	public static void main(String[] args) {
		// do the reverse of the pattern in array

		int [][] table= {{1,2,3,4},
                         {5,6,7,8},
                         {9,0,1,2}};
		
		for(int x=table.length-1; x>=0; x--) {
			for(int y=table[x].length-1; y>=0; y--) {
				System.out.print(table[x][y]+" ");
			}
			System.out.println();
		}
	}

}
