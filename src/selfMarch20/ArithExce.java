package selfMarch20;

public class ArithExce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans=0;
		try {
			int num=10;
			int div=0;
			ans=num/div;
		}catch(ArithmeticException ae) {
			ans=0;                           
		}catch(Exception e) {
			System.out.println("invalid calc");
		}
		System.out.println(ans);           
	}

}
