package selfMarch20;

public class V18s22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans;
		try {
			int num=10;
			int div=0;
			ans=num/div;
		}catch(ArithmeticException ae) {
			ans=0;
		}catch(Exception e) {
			System.out.println("invalid calculation");
		}
		//System.out.println("Answer= "+ans);  // The local variable ans may not have been initialized
	}

}
