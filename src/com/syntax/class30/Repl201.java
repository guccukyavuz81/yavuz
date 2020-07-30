package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl201 {

	public static void main(String[] args) {
		// Create a HashMap of String. 
//
//Add below pair to it . 
//"Street" = "Patrick ST"
//"Suite" = "265"
//"City" = "Vienna"
//"Zip" = "22180"
//"Country" = "United State"
//
//Print all the values in upper case using entrySet 

		Map<String, String> m=new HashMap<String, String>();
		m.put("Street", "Patrick ST");
		m.put("Suite", "265");
		m.put("City", "Vienna");
		m.put("Zip", "22180");
		m.put("Country", "United State");
		
		Set<Entry<String, String>> s=m.entrySet();
		for(Entry<String, String> f:s) {
			System.out.println(f.getValue().toUpperCase());
		}
		
	}

}
