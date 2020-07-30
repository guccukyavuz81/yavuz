package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ornekcik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> m=new HashMap<Integer, Integer>();
		m.put(1, 111);
		m.put(2, 222);
		m.put(3, 333);
		m.put(4, 444);
		System.out.println(m);
		
		System.out.println("-----------using lambda---------------");
		
		m.forEach((k,v)-> System.out.println(k+" "+v));
		
		System.out.println("---------using direct for loop-----------");
		
		for(Entry<Integer, Integer> e:m.entrySet()) {
		//	System.out.println(e.getKey()+"-----"+e.getValue());  no need for this below is shorter
			System.out.println(e);
		}
		System.out.println("================using Set and for loop=================");
		Set<Entry<Integer, Integer>> s=m.entrySet();
		
		for(Entry e:s) {
			System.out.println(e);
		}
		Iterator<Entry<Integer, Integer>> itr=s.iterator();
		while(itr.hasNext()) {
			Entry en=itr.next();
			System.out.println(en.getKey()+"~~~~~"+en.getValue());    
		}
	}

}
