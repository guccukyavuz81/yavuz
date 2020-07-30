package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW2 {

	public static void main(String[] args) {
		// Create a Map from array of cities that will sort keys in alphabetical order. 
//		As a key store the name of the city and as a value store the length of the city 
//		(Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//		If any city name is more than 7 characters remove that city .

		Map<String, Integer> m=new TreeMap<String, Integer>();
		m.put("Kastamonu", 9);
		m.put("Rize", 4);
		m.put("Ordu", 5);
		m.put("Kayseri", 7);
		
		Collection<Integer> co=m.values();
		Iterator<Integer> it=co.iterator();
		while(it.hasNext()) {
			if(it.next()>7) {
				it.remove();
			}
		}
		System.out.println(m);
		
		System.out.println("---------2nd way------------");
		
		Set<Entry<String, Integer>> s=m.entrySet();
		Iterator<Entry<String, Integer>> i=s.iterator();
		while(i.hasNext()) {
			if(i.next().getValue()>7) {
				i.remove();
			}
		}System.out.println(m);
		
		System.out.println("---------3rd way-----------");
		
		Set<String> se=m.keySet();
		for(String st:se) {
			if(st.length()>7) {
				m.remove(st);
			}
		}System.out.println(m);



		
	}

}
