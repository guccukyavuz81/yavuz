package com.syntax.class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW4 {

	public static void main(String[] args) {
//Create the collection that will store single unique Objects of a String type in which order is preserved.
//Write a logic to concatenate all string from the collection.

		 Set<String> s=new LinkedHashSet<>();
		 s.add("Samsun ");
		 s.add("Ordu ");
		 s.add("Adana ");
		 s.add("Istanbul ");
		 s.add("Adana ");
		 String e="";
		 
		 for(String str:s) {
			e=e+str;
		 }
		 System.out.println(e);
		 
		
	}

}
