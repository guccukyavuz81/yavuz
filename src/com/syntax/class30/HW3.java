package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW3 {

	public static void main(String[] args) {
		// Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets 
		//the highest salary. Output should be in the below format John Smith=$100000

		Map<String, Integer> m=new TreeMap<String, Integer>();
		
		m.put("Mr Brown=$", 85000);
		m.put("John Smith=$", 100000);
		m.put("Necati Delidana=$", 80000);
		m.put("Abidin Kulyutmaz=$", 90000);
		
		Integer max=0;
		
		Set<Entry<String, Integer>> s=m.entrySet();

		for(Entry<String, Integer> fs:s) {
			if(fs.getValue()>max) {
				max=fs.getValue();
			}
		}
		
		Iterator<Entry<String, Integer>> i=s.iterator();
		while(i.hasNext()) {
			if(i.next().getValue()!=max) {
				i.remove();
			}
		}
		
		for(Entry<String, Integer> f:s) {
			System.out.println(f.getKey()+f.getValue());
		}

		
		
		
		
	
		
		
			
		
		
}
}		



		
	


