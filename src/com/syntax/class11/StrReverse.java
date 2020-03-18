package com.syntax.class11;

public class StrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Sunday";
		for(int x=s.length()-1; x>=0; x--) {
			System.out.print(s.charAt(x)+" ");
			
		}System.out.println();
		System.out.println("...............2ND WAY.............");
		
		StringBuilder t=new StringBuilder("Sunday");
		System.out.println(t.reverse());
		System.out.println(".............................");
		
		
	}

}
