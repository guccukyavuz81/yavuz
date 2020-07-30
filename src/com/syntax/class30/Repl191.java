package com.syntax.class30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Repl191 {

	public static void main(String[] args) {
// Create a set collection in which you do not want to preserve or sort the order and add below values to it. 
//Red
//Pink
//Yellow
//White
//Black
//
//Print set collection
//And get total number of colors available in the set
//
//Expected Output:
//Original Hash Set: [Red, Pink, White, Yellow, Black]
//Size of the Hash Set: 5
		
		Set<String> s=new HashSet<>();
		s.add("Red");
		s.add("Pink");
		s.add("Yellow");
		s.add("White");
		s.add("Black");
		
		System.out.println("Original Hash Set: "+s);
		
		System.out.println("Size of the Hash Set:"+s.size());
		

	}

}
