package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> m=new HashMap<Integer, Integer>();
		m.put(1, 11);
		m.put(2, 22);
		m.put(3, 33);
		m.put(4, 44);
		
		System.out.println(m);
		System.out.println(m.keySet());
		for(Entry<Integer, Integer> ma:m.entrySet())  {
			System.out.println("key is "+ma.getKey()+" value is "+ma.getValue());
		}
		
		Set<Integer> s=m.keySet();
		for(Integer i:s) {
			System.out.println("the key is "+i+" and the value is "+m.get(i));
		}
		
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()) {
		Integer in=it.next();
			System.out.println("key is "+in+" value is "+m.get(in));
		}
		
		Collection<Integer> co=m.values();
		for(Integer x:co) {
			System.out.println("for next key the value is "+x);
		}
		
		System.out.println(m.get(1));
		System.out.println(m.containsKey(1));
		m.remove(1);
		System.out.println(m.containsKey(1));
		System.out.println(m.containsValue(22));
		System.out.println(m);
		



		
		
		
		
	}

}
