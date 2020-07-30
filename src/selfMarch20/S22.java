package selfMarch20;

public class S22 {

	static int count;
	public static void displaymsg() {
		System.out.println("welcome "+count++);  //Cannot make a static reference to the non-static field count
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       displaymsg();
       S22.displaymsg();
		
	}

}
