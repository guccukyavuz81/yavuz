package com.syntax.class17;

public class Repl126 {

	static String thirdLetter(String s){
	String[] sp=s.split("");
	String fin="";
	for(int x=0; x<sp.length; x+=3) {
	fin+=sp[x];	
	}
	return fin;
	}
	public static void main(String[] args) {
		//Write a method header on line two with the following specs:  
		  
		//Returns:
		//a String
		//Name:
		//thirdLetter
		//Parameters:
		//a String called s

		//Then complete the method by programming the following behavior
		//Returns every 3rd letter of the String s, 
		//starting from the first letter.
		//See below examples.

		//Examples:
		//thirdLetter("hello there") ==> "hltr"
		//thirdLetter("technology") ==> "thly"
		 
		System.out.println(thirdLetter("hello there")); //"hltr"
		System.out.println(thirdLetter("technology")); //"thly"
		
	}

}
