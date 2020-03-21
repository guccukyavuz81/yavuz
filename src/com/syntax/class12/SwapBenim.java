package com.syntax.class12;

public class SwapBenim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		int y=20;
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.print("x= "+x+" y="+y);
		System.out.println();
		
		String s="Zombi olduk";
		String a="Anasini satim";
		s=s+a;
		a=s.substring(0, s.length()-a.length());
		s=s.substring(a.length());
		System.out.println(" s : "+s+"  a : "+a);
	}

}
