package selfMarch20;

public class S81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5;
		
		while(isAvailable(x)) {
			System.out.println(x);
			x--;
		}
	}

	public static boolean isAvailable(int x) {
		return x-- > 0 ? true:false;
	}
}
