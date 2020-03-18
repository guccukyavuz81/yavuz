package hi;

public class TasElijon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int x=15; x<=35; x++) {
			if(x%2==0 && x%3==0) {
				continue;
			}
			System.out.print(x+" ");
		}
		
	}

}
