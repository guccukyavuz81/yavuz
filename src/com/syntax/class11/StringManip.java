package com.syntax.class11;

public class StringManip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s =" Fener$$$$ Sucks***cimbom oley  ";
		String t=s.toLowerCase();
		System.out.println(t);
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(15));
		System.out.println(s.indexOf("b"));
		System.out.println(s.contains("Fener"));
		System.out.println(s.lastIndexOf("e"));
		System.out.println(s.equalsIgnoreCase("fener sucks cimbom oley"));
		System.out.println(s.substring(6, 10));
		System.out.println(s.isEmpty());
		
		String[] w=s.split(" ");
		System.out.println(w[2]);
		for(int x=0; x<w.length; x++) {
			System.out.print(w[x]);
		}System.out.println("...............................");
		
		String z=w[0].trim();
		String j=w[1].trim();
		String o=w[2].trim();
		String h=w[3].trim();

		System.out.print(z+j+o+h);
		System.out.println();
		System.out.println(s.trim());
		System.out.println(s.replaceAll("[^A-Za-z]", ""));
		System.out.println(s.length());
		System.out.println(s.lastIndexOf('y'));

	}

}
