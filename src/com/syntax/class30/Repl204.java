package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Repl204 {

	void display(Map<String, Integer> map) {
		if(!map.isEmpty()) {
		Set<Entry<String, Integer>> s=map.entrySet();	
			for(Entry<String, Integer> f:s) {
				System.out.println(f.getKey()+f.getValue());
			}
		}else {
			System.out.println("map is empty");
		}
	}
	
	
	
	public static void main(String[] args) {
		//HashMap, Methods, reusability, Logic
//		Create a Method in Main class using below specification. 
//		Method Name: Display. 
//		Return Type: Void
//		Parameters : Map<String,Integer>
//		Logic: 
//		First the method will check the given map is empty or not. 
//		If the map is not empty print pairs of key and value using loops
//		If map is empty simply print "map is empty"
//
//		NOW IN MAIN METHOD
//		Create HashMap of String keys and Integer values
//		add values as below
//		map.put("mango", 10); 
//		map.put("apple", 30); 
//		map.put("orange", 20); 
//
//		using created display method to display. 
//
//		then clear the map. 
//
//		use the same method to display

		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		
		Repl204 r=new Repl204();
		r.display(map);
		 
		map.clear();
		r.display(map);
	}
}
