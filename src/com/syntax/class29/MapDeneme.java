package com.syntax.class29;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> m=new LinkedHashMap<>();
		m.put("Turkey", "Ankara");
		m.put("England", "London");
		m.put("USA", "Washington");
		m.put("Bangladesh", "Dhaka");
		
		System.out.println(m);
		System.out.println(m.get("Bangladesh"));
		
		Set<String> s=m.keySet();
		System.out.println(s);
		System.out.println("-------------------------------------");
		
		Iterator<String> it=s.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println("key is "+str+" and value is "+m.get(str));
		}
		System.out.println("--------------------------------------");
		
		for(String st:s) {
			System.out.println("key is "+st+" and value is "+m.get(st));
		}
		System.out.println("--------------------------------------------");
		
		Collection<String> co=m.values();
		System.out.println(co);
		
		Iterator<String> i=co.iterator();
		while(i.hasNext()) {
			System.out.println("the capital for the next country is "+i.next());
		}
		
		m.forEach((k,v)-> System.out.println(" al mamlakatul "+k+" vash shahrul "+v));
	}

}
