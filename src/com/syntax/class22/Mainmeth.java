package com.syntax.class22;

public class Mainmeth {

	static String kelime="jdhfhfj";
	
	public static void main(int [] args) {
		System.out.println("int [] args");

		
	}
	public static void main(String args) {
		System.out.println("String args");

		
	}
	public static void main(String[] args) {
		System.out.println("hangisini cagiriyor diye baktim :String[] args");

		main("jdfjd");
		main(kelime);
		int [] arr=new int [5];
		main(arr);
	}

}
