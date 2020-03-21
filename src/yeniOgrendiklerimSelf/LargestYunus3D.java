package yeniOgrendiklerimSelf;

public class LargestYunus3D {

	public static void main(String[] args) {
		// CALISIYOR
		int[][][] ddd = { { { -1, 90, 7, 430 }, { 5612, 78,2} }, { { 8, 5, 12, 545 }, { 40, 67 }, { 80, 54, 345 } } };
        int max = 0;
        int min =ddd[0][0][0];
        int secondmax=0;
        for (int[][] x : ddd) {
            for (int[] y : x) {
                for (int z : y) {
                    if (z > max) {
                     secondmax=max;
                        max = z;
                    }else if(z>secondmax) {
                        secondmax=z;
                    }else if(z<min){
                    	min=z;
                    }
                }
            }
        }
        System.out.println(max);
        System.out.println(secondmax);
        System.out.println(min);
	}

}
