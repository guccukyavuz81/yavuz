package com.syntax.class11;

public class StringManp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="today is a rainy day";
		System.out.println(str.substring(6));
		System.out.println(str.subSequence(0, 5));
		System.out.println(str.substring(0, 5));
		String x=str.substring(11, 17);
		System.out.println(x);
		
	}

}
