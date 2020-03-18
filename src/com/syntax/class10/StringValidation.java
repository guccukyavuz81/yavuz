package com.syntax.class10;

public class StringValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="welcome syntax students";
		String str2="Welcome syntax students  ";
		
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.contains("syntax"));
		
		if(str2.trim().equalsIgnoreCase(str1)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		StringBuilder sb=new StringBuilder("mayislar bizimdir");
		System.out.println(sb.reverse());
		System.out.println("....................................................");
		
		
		
	}

}
