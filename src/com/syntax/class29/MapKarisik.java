package com.syntax.class29;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapKarisik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> m=new LinkedHashMap<>();
		m.put(104, "Joe");
		m.put(102, "Avarel");
		m.put(101, "Mike");
		m.put(103, "Vijay");
		
		System.out.println(m);
		
		Map<Integer,String> tm=new TreeMap<>(m);
		System.out.println(tm);
		
		Map<String, Integer> pop=new TreeMap<>();
		pop.put("papua new guinee", 342900);
		pop.put("bahamas", 135786);
		pop.put("linchestein", 3429);
		
		System.out.println(pop);   
		System.out.println("----------------------------------------");
		
		Set<String> st=pop.keySet();
		
		for(String s:st) {
			System.out.println("loop key is "+s+" and the value is "+pop.get(s));
		}System.out.println("---------------------------------------");
		
		Iterator<String> it=st.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println("iterator key is "+str+" and value is "+pop.get(str));
		}
		System.out.println("----------------------------------------------");
		
		Collection<Integer> co=pop.values();
		
		Iterator<Integer> i=co.iterator();
		while(i.hasNext()) {
			System.out.println("population of the next country is "+i.next());
		}
		System.out.println("---------bir dahii for each ile--------------");
		
		for(Integer in:co) {
			System.out.println(in);
		}
		
		System.out.println(pop.entrySet());
		
		System.out.println("----using lambda exp-----------");
		
		m.forEach((k,v) -> System.out.println(k+" "+v));
		
		System.out.println("--------------------------------");
		
		pop.forEach((k,v) -> System.out.println(k+" "+v));
	}

}
