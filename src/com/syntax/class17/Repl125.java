package com.syntax.class17;

public class Repl125 {
	
	static String mixString (String s1, String s2) {
		String fristValue="";
		String [] sp=s1.split("");
		String [] spl=s2.split("");
		for(int x=0; x<sp.length; x++) {
			fristValue+=sp[x]+spl[x];		
		}
		return fristValue;
	}
	static String mixStringg (String s1, String s2) {
		String secondValue="";
		String [] sp=s1.split("");
		String [] spl=s2.split("");
		for(int x=0; x<sp.length; x++) {
			secondValue+=sp[x]+spl[x];		
		}
		return secondValue;
	}
	
	public static void main(String[] args){
		  String fristValue = mixString("12345","abcde"); 
			System.out.println(fristValue); 
			String secondValue = mixString("howdy","hello");
			System.out.println(secondValue); 
		}
}
