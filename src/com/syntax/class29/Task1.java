package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		// Create a Set collection in which you need to add names of the countries. 
//		In this set we want all objects to be sorted in alphabetical order. 
//		Using 2 different ways retrieve all elements from set.

		Set<String> c=new TreeSet<>();
		c.add("Turkey");
		c.add("Tanzania");
		c.add("Liberia");
		c.add("Yemen");
		
		System.out.println(c);
		
		for(String s:c) {
			System.out.println(s);
		}System.out.println("------iterator-------");
		Iterator<String> it=c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
