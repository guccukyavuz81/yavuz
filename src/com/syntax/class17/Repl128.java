package com.syntax.class17;

public class Repl128 {
	static int countVowels(String s) {
	int count=0;
	String[]sp=s.split("");
	for(int x=0; x<sp.length; x++) {
	if(sp[x].equals("a") || sp[x].equals("e") || sp[x].equals("i") || sp[x].equals("o") || sp[x].equals("u")) {
	count++;
	}
	}return count;
	}
	public static void main(String[] args) {
// Write a method with the following specs:  Returns:an integer  Name:countVowels Parameters:a String called s
//Purpose:count the number of vowels in the string s.  Assume s is all lowercase. Examples:countVowels("obama") ==> 3
//                                                                          countVowels("happy friday! i love weekends") ==> 9

		System.out.println(countVowels("obama")); //3
		System.out.println(countVowels("happy friday! i love weekends")); //9	
	}

}
