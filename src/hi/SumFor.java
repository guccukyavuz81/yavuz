package hi;

public class SumFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int sumEven=0;
		int sumOdd=0;
		for(int x=1; x<=50; x++) {
			if(x%2==0) {
		    sumEven=sumEven+x;
			}
			else {
				sumOdd=sumOdd+x;	
				
			
		}
		
	}
		int total=sumEven+sumOdd;
		System.out.println("total is "+total);	
}
}