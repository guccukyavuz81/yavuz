package yeniOgrendiklerimSelf;

public class MathMethodDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Math.sqrt(4));
		
		System.out.println(square(4));
	}
	 
	
	public static int square(int x) {
		int result=x*x;
		return result;
	}
}
// public keyword makes the method public so that it can be accessed from outside of the class
//static keyword denotes that the method can be accessed without creating the object of the class
//class is the blueprint(OR TEMPLATE) from which the object is made

