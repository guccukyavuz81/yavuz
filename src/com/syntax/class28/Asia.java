package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Asia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> asia = new ArrayList<String>();
		asia.add("China");
		asia.add("Tajikistan");
		asia.add("Japan");
		asia.add("Turkey");
		asia.add("China");
		asia.add("Nepal");
		asia.add("Japan");
		System.out.println("before removal");
		System.out.println(asia);
		
		List<String> as=new ArrayList<>();
		Iterator<String> it=asia.iterator();
		for(int x=0; x<asia.size(); x++) {
			if(!as.contains(asia.get(x))) {
				as.add(asia.get(x));
			}
		}
		System.out.println("after removal");
		System.out.println(as);
	}

}

	// Add countries into Asia, add duplicates. I did it for you :)
	// Iterate the Asia list and remove duplicates
	// hint: you can create a new List
	// copy from asia into new list,
	// but first check if the list CONTAINS the country