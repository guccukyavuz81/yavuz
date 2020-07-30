package com.syntax.class33;

public class OutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello";
		
		try {
			char  c=str.charAt(8);
			System.out.println(c);
		}catch(Exception se) {
		//	System.out.println(se);    //java.lang.StringIndexOutOfBoundsException: String index out of range: 8
			se.printStackTrace();      //java.lang.StringIndexOutOfBoundsException: String index out of range: 8
                                       //			at java.lang.String.charAt(Unknown Source)
                                       //			at com.syntax.class33.OutOfBounds.main(OutOfBounds.java:11)
		//System.out.println(se.getMessage());     //String index out of range: 8
		}
		
		System.out.println("rest of the code");
	}

}
