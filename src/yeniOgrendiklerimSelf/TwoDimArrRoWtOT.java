package yeniOgrendiklerimSelf;

public class TwoDimArrRoWtOT {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		
	    int [][] table= {{1,2,3,4},
	                     {5,6,7,8},
                         {9,0,1,2},
	                     {3,5,7,6}};

        for(int x=0; x<table.length; x++) {
        	for(int y=0; y<table[x].length; y++) {
        		if(x==0) {
        			sum1=sum1+table[0][y];
        		}else if(x==1) {
        			sum2=sum2+table[1][y];
        		}else if(x==2) {
        			sum3=sum3+table[2][y];
        		}else {
        			sum4=sum4+table[3][y];
        		}
        			
        	}
        	
        }
        System.out.println(sum1);
    	System.out.println(sum2);
    	System.out.println(sum3);
    	System.out.println(sum4); 
	}

}
