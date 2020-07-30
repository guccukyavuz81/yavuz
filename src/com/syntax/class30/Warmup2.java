package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Warmup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Double> m=new HashMap<Integer, Double>();
		m.put(1, 1.1);
		m.put(2, 2.2);
		m.put(3, 3.3);
		m.put(4, 4.4);
		m.put(5, 5.5);
		
		System.out.println(m);
		System.out.println(m.entrySet());
		
		m.forEach((k,v) -> System.out.println("for key "+k+" I have value "+v));
		
		for(Entry<Integer, Double> ma:m.entrySet()) {
			System.out.println("the value for key "+ma.getKey()+" is "+ma.getValue());
		}
		
		Set<Integer> s=m.keySet();
		for(Integer i:s) {
			System.out.println("we have value "+m.get(i)+" for the key "+i);
		}
		
		Collection<Double> co=m.values();
		for(Double d:co) {
			System.out.println(" the next value is "+d);
		}
		
		m.forEach((k,v)-> System.out.println("key is "+k+" value is "+v));
		
		for(Entry<Integer, Double> map:m.entrySet()) {
			System.out.println("key is "+map.getKey()+" value is "+map.getValue());
		}




		
		
		
	}

}
