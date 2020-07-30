package com.syntax.class17;

public class Repl129 {

	static String surround(String s,String search_term) {
		
		String fin="";
		String[]sp=s.split("");
		for(int x=0; x<sp.length; x++) {
		String w="("+sp[x]+")";
		if(sp[x].equals(search_term)) {
		sp[x]=w;
		}fin+=sp[x];
	}return fin;
		
	}
	
	public static void main(String[] args) {
// Write a method with the following specs:    Returns:a String  Name:surround  Parameters:a String called s
//a String called search_term   Then complete the method by programming the following behavior
//Return a new String built from s that has every instance of the search term surrounded by parentheses
//See below examples. Examples: surround("abcabcabc",'c') ==> "ab(c)ab(c)ab(c)" surround("technology",'o') ==> "techn(o)l(o)gy"
		System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
		System.out.println(surround("technology","o")); //"techn(o)l(o)gy
	}

}
