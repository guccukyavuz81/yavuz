package com.syntax.class12;

public class AselCodeQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Reverse String character by character
		 * word by word
		 */

			String given="I love java";
			String reversed="";

			for(int i=given.length()-1; i>=0; i--) {
				reversed=reversed+given.charAt(i);
			}

			System.out.println("Reversed String = "+reversed);

			String[] array=given.split(" ");
			String reverseWords="";

			for(int i=array.length-1; i>=0; i--) {
				reverseWords=reverseWords+array[i]+" ";
			}

			System.out.println("Reversed String word by word= "+reverseWords);
	}

}
