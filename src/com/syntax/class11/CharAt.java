package com.syntax.class11;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Good morning students";
		System.out.println(str.charAt(5));
		char x=str.charAt(7);
		System.out.println(x);
		
		//for(int y=0; y<str.length(); y++) {
		//System.out.print(str.charAt(y)+" ");        EASIER BUT HOCA DID THIS:
		
		char a;
		for(int y=0; y<str.length(); y++) {
			a=str.charAt(y);
			System.out.print(a+" ");
		}
		System.out.println();
		
		System.out.println(str.indexOf("o"));
		int i=str.indexOf("r");
		System.out.println(i);
		System.out.println(str.indexOf("morning"));
		System.out.println(str.indexOf(" "));
		String w=str.substring(5, 15);
		System.out.println(w);
		System.out.println(str.lastIndexOf('o'));
		
		
	}

}
