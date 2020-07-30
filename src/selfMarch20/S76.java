package selfMarch20;

import java.util.ArrayList;

public class S76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList myList =new ArrayList();
		String[] myArray;
		try {
			while(true) {
				myList.add("My String");
			}
		}
		catch(RuntimeException re) {
			System.out.println("caught a re");
		}
		catch(Exception e) {
			System.out.println("caught an exception");
		}
		System.out.println("ready to use");
	}

}
