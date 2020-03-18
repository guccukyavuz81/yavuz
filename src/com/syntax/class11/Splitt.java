package com.syntax.class11;

public class Splitt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c="cimbom cimbom oley";
		String [] s=c.split(" ");
		
		for(int x=0; x<s.length; x++) {
			System.out.println(s[x]);
		}
	}

}
