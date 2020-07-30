package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Sutuden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Character> m=new TreeMap<>();
		m.put("Jim", 'B');
		m.put("Ajay", 'C');
		m.put("Abuzer", 'A');
		System.out.println(m);
		
		Set<String> s=m.keySet();
		
		Iterator<String> it=s.iterator();
		while(it.hasNext()) {
			String si=it.next();
			System.out.println("sutudent is "+si+" and da gireyd is "+m.get(si));
		}
		
		Collection<Character> co=m.values();
		Iterator<Character> itoglu=co.iterator();
		while(itoglu.hasNext()) {
			System.out.println(" da gireyd of di sutuden is "+itoglu.next());
		}
		
		m.forEach((k,v)->System.out.println("talebe "+k+" derecesi ise "+v));


		
		
	}

}
