package com.syntax.class12;

public class AselCodeQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Find out how many alpha characters are present in a String? 
		 * Find number of words in string?
		 */

		String str=" Hih9898jhjh%%^$%^   oio   ";
		str=str.replaceAll("[^A-Za-z]", "");
		int number=str.length();
		System.out.println("Number of alpha character = "+number);

		String myString="Today is Wednesday and it is Java Class";
		String[] array=myString.split(" ");
		int words=array.length;
		System.out.println("Total words in string:"+myString+" = "+words);

	}

}