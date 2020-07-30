package com.syntax.class30;


import java.util.*;
import java.util.Map.Entry;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> m=new LinkedHashMap<String, Integer>();
		m.put("Jan", 31);
		m.put("Feb", 28);
		m.put("Mar", 31);
		m.put("April", 30);
		
		System.out.println(m);
		
		m.forEach((k,v)-> System.out.println(k+"=="+ v));
		
		for(Entry<String, Integer> e:m.entrySet()) {
			System.out.println("month "+e.getKey()+" has "+e.getValue()+" days");
		}
		System.out.println("-----------------------------------------");
		
		Set<Entry<String, Integer>> se=m.entrySet();
		for(Entry<String, Integer> f:se) {
			System.out.println(f);
		}
		Iterator<Entry<String, Integer>> it=se.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> ie=it.next();
			System.out.println("month "+ie.getKey()+" has "+ie.getValue()+" days");
		}
		
		
		
	}

}
