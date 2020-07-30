package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Repl200 {

	public static void main(String[] args) {
// Create a Map that will preserve an order of entry objects
//		Add below pair to it . 
//		"Street" = "Patrick ST"
//		"Suite" = "265"
//		"City" = "Vienna"
//		"Zip" = "22180"
//		"Country" = "United State"
//
//		Print all values using iterator
//
//		Expected output:
//		Patrick ST
//		265
//		Vienna
//		22180
//		United State

		Map<String, String> m=new LinkedHashMap<String, String>();
		m.put("Street", "Patrick ST");
		m.put("Suite", "265");
		m.put("City", "Vienna");
		m.put("Zip", "22180");
		m.put("Country", "United State");
		
		Set<Entry<String, String>> s=m.entrySet();
		Iterator<Entry<String, String>> it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getValue());
		}
	}

}
