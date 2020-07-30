package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl202 {

	public static void main(String[] args) {
		//Create a Hash Map of String pairs 
//		add the follow values
//		map.put("ONE","AAA");
//		map.put("TWO","BBB");
//		map.put("THREE","CCC");
//		map.put("FOUR","DDD");
//		map.put("FIVE","EEE");
//
//		Using entry set print key and values pairs using loop
//
//		Remove below from Map
//		"ONE"
//		"FOUR"
//
//		Using entry set print key and values pairs using loop
//
//		Expected Output:
//		HashMap Before Remove :
//		FIVE : EEE
//		ONE : AAA
//		FOUR : DDD
//		TWO : BBB
//		THREE : CCC
//		------------------
//		HashMap After Remove :
//		FIVE : EEE
//		TWO : BBB
//		THREE : CCC


		Map<String, String> map=new HashMap<String, String>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		
		Set<Entry<String, String>> s=map.entrySet();
		System.out.println("HashMap Before Remove :");
		for(Entry<String, String> f:s) {
		System.out.println(f.getKey()+" : "+f.getValue());	
		}
		System.out.println("------------------");
		Iterator<Entry<String, String>> it=s.iterator();
		while(it.hasNext()) {
			Entry<String, String> e=it.next();
			if(e.getKey().equals("ONE")||e.getKey().equals("FOUR")){
				it.remove();
			}
		}
		
		System.out.println("HashMap After Remove :");
		for(Entry<String, String> f:s) {
		System.out.println(f.getKey()+" : "+f.getValue());	
		}
	}

}
