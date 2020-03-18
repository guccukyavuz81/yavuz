package yeniOgrendiklerimSelf;

public class ArrPrcKitap {

	public static void main(String[] args) {
		// find the sum of the first elements in each row

		int [][] table= {{1,2,3,4},
                         {5,6,7,8},
                         {9,0,1,2}};
		int sum=0;
		for(int x=0; x<table.length; x++) {
			sum=sum+table[x][0];
		}
		System.out.println(sum);
	}

}
