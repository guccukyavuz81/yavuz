package com.syntax.class28;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s=new LinkedHashSet<>();
		s.add("apple");
		s.add("mango");
		s.add("kiwi");
		s.add("apple");
		System.out.println(s);
		Set<String> lh=new HashSet<>(s);
		System.out.println(lh);
		lh.remove("mango");
		System.out.println(lh); 
		
		System.out.println(Collections.min(s));
	}

}
