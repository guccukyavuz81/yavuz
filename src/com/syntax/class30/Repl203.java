package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Repl203 {

	public static void main(String[] args) {
		// Create Hash Map. 
//		add the follow values
//
//		map.put("ONE","AAA");
//		map.put("TWO","BBB");
//		map.put("THREE","CCC");
//		map.put("FOUR","DDD");
//		map.put("FIVE","EEE");
//
//		Using EntrySet print the key and values pairs using iterator only
//
//		replace with below key THREE--> ASEL and key FIVE-->SUMAIR
//
//		Using EntrySet print the key and values pairs using iterator only
//
//		OUTPUT
//		 
//		HashMap Before Replace :
//		FIVE : EEE
//		ONE : AAA
//		FOUR : DDD
//		TWO : BBB
//		THREE : CCC
//		------------------
//		HashMap After Replace :
//		FIVE : SUMAIR
//		ONE : AAA
//		FOUR : DDD
//		TWO : BBB
//		THREE : ASEL


		Map<String, String> map=new HashMap<String, String>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		
		Set<Entry<String, String>> s=map.entrySet();
		System.out.println("HashMap Before Replace :");
		Iterator<Entry<String, String>> it=s.iterator();
		while(it.hasNext()) {
			Entry<String, String> e=it.next();
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		System.out.println("------------------");
		Iterator<Entry<String, String>> i=s.iterator();
		while(i.hasNext()) {
			Entry<String, String> en=i.next();
			if(en.getKey().equals("THREE")) {
				en.setValue("ASEL");
			}else if(en.getKey().equals("FIVE")) {
				en.setValue("SUMAIR");
			}
		}
		System.out.println("HashMap After Replace :");
		

		Iterator<Entry<String, String>> itr=s.iterator();
		while(itr.hasNext()) {
			Entry<String, String> ent=itr.next();
			System.out.println(ent.getKey()+" : "+ent.getValue());
		}
	}

}
