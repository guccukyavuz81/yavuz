package com.syntax.class12;

public class AlphaCharacters {

	public static void main(String[] args) {
		//1.how many alpha characters do you have in the string?  2.how many words do you have in a sentence

		String str1="naber@#$%&la&%%$%%^olum";
		String str2=str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str2.length());
		
		
		String s="Naber kardes ne ayaksin?";
		String[]a=s.split(" ");
		System.out.println(a.length);
	}

}
