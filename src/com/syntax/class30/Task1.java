package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class Task1 {

	public static void main(String[] args) {
		// Create a map of countries with its capital that will store countries in alphabetical order.
//		Print all keys and values from a country map using for each loop and iterator.
//		Print all values from a country map using for each loop and iterator.


		Map<String, String> m= new TreeMap<String, String>();
		m.put("Turkey", "Ankara");
		m.put("USA", "Washington");
		m.put("Germany", "Berlin");
		m.put("Iraq", "Bagdad");
		m.put("Syria", "Damascus");
		
		System.out.println(m);
		Set<String> s=m.keySet();
		for(String st:s) {
			System.out.println(m.get(st)+" is the capital of "+st);
		}
		Iterator<String> it=s.iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println(" for country "+key+" the capital is "+m.get(key));
		}
		
		
		Collection<String> co=m.values();
		for(String str:co) {
			System.out.println("next capital in the list is "+str);
		}
		Iterator<String> i=co.iterator();
		while(i.hasNext()) {
			System.out.println("next capital is "+i.next());
		}
		
		for(Entry<String, String> e:m.entrySet()) {
			System.out.println("the country "+e.getKey()+" the capital is "+e.getValue());
		}
		
		m.forEach((k,v)-> System.out.println(k+" "+v));




		
		
	}

}
