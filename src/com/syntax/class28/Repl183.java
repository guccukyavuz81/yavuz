package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class Repl183 {

	public static void main(String[] args) {
		// Create a Linked List that will store Integer Objects from 50-100.
//		Once Linked List is created remove all numbers that are not divisible by 3.
//		Print Linked List
//		Expected Output
//		[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]

		
		LinkedList<Integer> in=new LinkedList<>();
		for(int x=50; x<=100; x++) {
			in.add(x);
		}
		
		Iterator<Integer> it=in.iterator();
		while(it.hasNext()) {
			if(it.next()%3!=0) {
				it.remove();
			}
		}
		
		System.out.println(in);
		
	}

}
