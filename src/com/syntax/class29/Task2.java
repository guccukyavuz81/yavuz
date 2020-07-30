package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task2 {

	public static void main(String[] args) {
		// Create a Set of cities in which you want to make sure that insertion order is maintained.
		//Using Iterator remove any city that starts with “A”;

		LinkedHashSet<String> city=new LinkedHashSet<>();
		city.add("Paris");
		city.add("Ankara");
		city.add("London");
		city.add("Amsterdam");
		city.add("Dhaka");
		
		Iterator<String> it=city.iterator();
		while(it.hasNext()) {
			if(it.next().startsWith("A")){
				it.remove();
			}
		}System.out.println(city);




	}

}
