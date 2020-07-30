package com.syntax.class17;

public class Task3 {

	private static String mett (String s) {
	String fin="";
	String[]sp=s.split("");
	for(int x=0; x<sp.length; x++) {
	if(sp[x].equals("a") || sp[x].equals("e") || sp[x].equals("i") || sp[x].equals("o") || sp[x].equals("u")) {
		fin+=sp[x];
	}
	}return fin;
	}
	
	
	
	
	public static void main(String[] args) {
		// Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
		//Method should be available inside the class where it was declared and executed by calling it is name.

		
		System.out.println(Task3.mett("ne ayaksin"));
	}

}
