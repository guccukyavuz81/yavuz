package selfMarch20;

public class S139 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=6;
		while(isAvailable(x)) {
			System.out.println(--x);
		}
	}
	public static boolean isAvailable(int x) {
		return --x>0 ? true : false;
	}

}
