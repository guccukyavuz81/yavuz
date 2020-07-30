package com.syntax.class28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> l= Arrays.asList("hi","bye","hi","dude","bye","cool");
		
		Set<String> s=new HashSet<>(l);
		
		System.out.println(s);
		
		SortedSet<Integer> so=new TreeSet<>();
		
		so.add(121);
		so.add(32);
		so.add(65);
		so.add(23);
		
		System.out.println(so);
		
		SortedSet<String> sor=new TreeSet<>(l);
		System.out.println(sor);
		
	}

}
