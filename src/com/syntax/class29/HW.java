package com.syntax.class29;

import java.util.*;
import java.util.Map.Entry;


public class HW {

	public static void main(String[] args) {
		//Create a map of a building. Store floor number and it is associated company name. 
		//(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values. 
//		Check how many entries you have?
//				Update company on a 4th floor 
//				Remove company on the 7th floor
//				Print your map

		Map<Integer, String> m= new HashMap<Integer, String>();
		m.put(1, "HR");
		m.put(5, "Google");
		m.put(3, "Library");
		m.put(4, "Kiraathane");
		m.put(2, "HR");
		m.put(3, "Syntax");
		m.put(1, "BugBuster");
		m.put(7, "HaciSakir");
		m.put(6, "Seydioglu");
		System.out.println(m.size());
		m.replace(4, "H&M");
		m.remove(7);
		System.out.println(m);
		
		System.out.println("----------lambda---------------");
		m.forEach((k,v)-> System.out.println("at floor "+k+" we have "+v));
		
		Set<Integer> s=m.keySet();
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			System.out.println("at floor "+i+" there is "+m.get(i));
		}
		Collection<String> co=m.values();
		Iterator<String> i=co.iterator();
		while(i.hasNext()) {
			System.out.println("this floor leads to "+i.next());
		}
		for(Entry<Integer, String> map:m.entrySet()) {
			System.out.println("floor # "+map.getKey()+" is "+map.getValue());
		}
		 
		}
}


