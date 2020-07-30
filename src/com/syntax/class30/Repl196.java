package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl196 {

	public static void main(String[] args) {
// Create a Map in which you do not need to preserve the order of the entries
//		Add below pair to it . 
//
//		"Street" = "Patrick ST"
//		"Suite" = "265"
//		"City" = "Vienna"
//		"Zip" = "22180"
//		"Country" = "United State"
//
//		Find how many entries are inside the map
//		Remove all entires from the Map
//		Find the Map size again
//
//		Expected Output:
//		5
//		0

		Map<String, String> m=new HashMap<String, String>();
		m.put("Street", "Patrick ST");
		m.put("Suite", "265");
		m.put("City", "Vienna");
		m.put("Zip", "22180");
		m.put("Country", "United State");
		
		System.out.println(m.size());
		
		m.clear();
		
		System.out.println(m.size());
	}

}
