package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> m=new HashMap<String, String>();
		m.put("USA", "Washington DC");
		m.put("Turkey", "Ankara");
		m.put("Syria", "Damascus");
		m.put("Italy", null);
		m.put(null, "jfjjf");
		m.put(null, "kjjj");     //doesn't allow the second null key
		m.put("djfjf", null);    //allows multiple null values
		System.out.println(m);
		
		Set<String> s=m.keySet();
		Iterator<String> it=s.iterator();
		while(it.hasNext()) {
		String key=it.next();
		System.out.println(key+"-->"+m.get(key));
		}
		Set<Entry<String, String>> st=m.entrySet();
		Iterator<Entry<String, String>> itr=st.iterator();
		while(itr.hasNext()) {
			Entry<String, String> e=itr.next();
			System.out.println(e.getKey()+"~~"+e.getValue());
		}
		
		Collection<String> co=m.values();
		System.out.println(co);
		it=co.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Map<String, String> ht=new Hashtable<>();
		ht.put("USA", "Washington DC");
		ht.put("Turkey", "Ankara");         //doesn't allow any null key or value    
		ht.put("Syria", "Damascus");
		System.out.println(ht);
		
		
		
		
		
	}

}
