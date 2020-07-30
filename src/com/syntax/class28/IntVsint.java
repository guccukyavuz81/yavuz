package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IntVsint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10000;
		Integer i=x;
		String s=i.toString();
		System.out.println(s.length());
		
		
		List<Integer> w=new ArrayList<Integer>();
		w.add(12);
		w.add(23);
		w.add(34);
		w.add(45);
		System.out.println(w);
		
		ListIterator<Integer> it=w.listIterator(w.size());
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		
	}

}
