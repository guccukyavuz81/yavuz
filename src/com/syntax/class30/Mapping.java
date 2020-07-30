package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> m=new HashMap<Integer, Integer>();
		
		m.put(1, 11);
		m.put(2, 22);
		m.put(3, 33);
		
		System.out.println("whole map printed"+m);
		Set<Integer> s=m.keySet();
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()) {
		Integer i=it.next();
		System.out.println(i+"->"+m.get(i));
		}
		
		Collection<Integer> co=m.values();
		for(Integer f:co) {
			System.out.println(f);
		}
		
		Set<Entry<Integer, Integer>> se=m.entrySet();
		Iterator<Entry<Integer, Integer>> itr=se.iterator();
		while(itr.hasNext()) {
		Entry<Integer, Integer> in=itr.next();
		System.out.println(in.getKey()+"->"+in.getValue());
		}
		
		for(Entry<Integer, Integer> f:se) {
			System.out.println(f.getKey()+"-->"+f.getValue());
		}
		
		System.out.println(se);  //entries printed
		
	}

}
