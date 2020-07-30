package com.syntax.class30;

import java.util.ArrayList;
import java.util.List;

public class HW5 {

	public static void main(String[] args) {
		// Create a collection of integers in which you can keep duplicates. 
        //Write a logic to find sum of all integers

		List<Integer> x=new ArrayList<Integer>();
		x.add(12);
		x.add(32);
		x.add(43);
		x.add(54);
		Integer a=0;
		for(Integer f:x) {
		a=a+f;	
		}System.out.println(a);



		
	}

}
