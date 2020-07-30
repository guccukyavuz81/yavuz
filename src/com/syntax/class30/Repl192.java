package com.syntax.class30;

import java.util.Set;
import java.util.TreeSet;

public class Repl192 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Create Set to store String Objects and you want them to be stored in ascending order
//		Please add the below values and see the result 
//		"India"
//		"Australia"
//		"South Africa"
//		"India"
//		"America"
//		"America"
//
//		Print the Set. 
//
//		Expected Output: 
//		[America, Australia, India, South Africa]
//		
		Set<String> s=new TreeSet<String>();
		s.add("India");
		s.add("Australia");
		s.add("South Africa");
		s.add("India");
		s.add("America");
		s.add("America");
		System.out.println(s);
		
		
		
	}

}
