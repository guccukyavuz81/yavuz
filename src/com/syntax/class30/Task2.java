package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> m=new TreeMap<Integer, String>();
		m.put(12345, "HP Laptop");
		m.put(54321, "Dell desktop");
		m.put(12321, "Flat TV");
		m.put(33221, "Blootooth Speaker");
		
		System.out.println(m);
		
		m.forEach((k,v) -> System.out.println(k+"~~~~~~~"+v));
		
		for(Entry<Integer, String> f:m.entrySet()) {
			System.out.println("product no "+f.getKey()+" is "+f.getValue());
		}
		
		Set<Entry<Integer, String>> s=m.entrySet();
		
		for(Entry<Integer, String> e:s) {
			//System.out.println(e);  shorter but i wanted to have some methods...
			Integer i=e.getKey();
			String st=e.getValue().toUpperCase();
			System.out.println("item #  "+i+" is "+st);
		}
		
		Iterator<Entry<Integer, String>> it=s.iterator();
		while(it.hasNext()) {
			Entry e=it.next();
			System.out.println("product serial # is "+e.getKey()+" for product "+e.getValue());
		}



		
		
		
		
	}

}
