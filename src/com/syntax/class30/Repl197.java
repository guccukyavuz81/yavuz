package com.syntax.class30;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl197 {

	public static void main(String[] args) {
		// Create A Map that will preserve an order of entry objects
//Add below pairs :
//"Street" = "Patrick ST"
//"Suite" = "265"
//"City" = "Vienna"
//"Zip" = "22180"
//"Country" = "United State"
//Print all values of from the map 
//Expected Output:
//Patrick ST
//265
//Vienna
//22180
//United State

		Map<String, String> m=new LinkedHashMap<String, String>();
		m.put("Street", "Patrick ST");
		m.put("Suite", "265");
		m.put("City", "Vienna");
		m.put("Zip", "22180");
		m.put("Country", "United State");
		
		Set<Entry<String, String>> s=m.entrySet();
		for(Entry<String, String> f:s) {
			System.out.println(f.getValue());
		}
		
		
	}

}
