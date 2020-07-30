package com.syntax.class17;

public class Repl127 {

	static int countA (String s) {
	int count=0;
	String[]sp=s.split("");
	for(int x=0; x<sp.length; x++) {
	if(sp[x].equalsIgnoreCase("a")) {
	count++;	
	}
	}
	return count;
	}
	public static void main(String[] args) {
		// Create a static method with the following specs:  Returns:an integer  Name:countA   Parameters:a String called s
//Purpose:count the number of occurrences of 'a' or 'A' within s     Examples:countA("aaa") ==> 3
//                                                                            countA("aaBBdf8k3AAadnklA") ==> 6
//Hint: How do you write a for loop to loop through every letter of a string?  You've done this multiple times already :)
		System.out.println(countA("aaA")); //3
		System.out.println(countA("aaBBdf8k3AAadnklA")); //6
	}

}
