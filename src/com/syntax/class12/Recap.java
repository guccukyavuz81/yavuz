package com.syntax.class12;

public class Recap {

	public static void main(String[] args) {
		// swap 2 strings without a temporary variable
		
		int x=10;
		int y=20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x);
		System.out.println(y);

		String str1="Day";
		String str2="Night";
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		
		//another way
				String s1="Hello";
				String s2="Bye";
				
				String shorterstr1 = s1+s2;
				s2 = shorterstr1.replace(s2, "");
				s1 = shorterstr1.replace(s2, "");
				
				System.out.println("The value of s1 = "+s1);
				System.out.println("The value of s2 = "+s2);
		
		
		
		
		
		
		
		
		
		
	}

}
