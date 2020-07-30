package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Repl199 {

	public static void main(String[] args) {
		//Create HashMap 
//		add values as below
//
//		map.put("mango", 10); 
//		map.put("apple", 30); 
//		map.put("orange", 20); 
//		map.put("mango", 40); 
//		 map.put("mango", 40);     
//
//		Using iterator retrieve all keys and values if the format below:
//
//		Expected Output:
//		Key = orange and value = 20
//		Key = apple and value = 30
//		Key = mango and value = 40

		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		map.put("mango", 40); 
		map.put("mango", 40);   
		
		Set<Entry<String, Integer>> s=map.entrySet();
		Iterator<Entry<String, Integer>> it=s.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> e=it.next();
			System.out.println("Key = "+e.getKey()+" value = "+e.getValue());
		}

	}

}
