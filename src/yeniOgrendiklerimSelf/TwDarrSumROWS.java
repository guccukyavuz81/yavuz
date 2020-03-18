package yeniOgrendiklerimSelf;

public class TwDarrSumROWS {

	public static void main(String[] args) {
		// sum of each row
		
		
		
		    
		    int [][] table= {{1,2,3,4},
		                     {5,6,7,8},
                             {9,0,1,2}};

            for(int x=0; x<table.length; x++) {
            	int sum=0;
            	for(int y=0; y<table[x].length; y++) {
            	sum=sum+table[x][y];
            	}
            	System.out.println("sum of the row "+x+" is "+sum);
            }
		      
		     		      
}
}


