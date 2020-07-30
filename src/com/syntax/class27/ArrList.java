package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> alist=new ArrayList<>();
		alist.add(10.99);
		alist.add(12.87);
		alist.add(1.234);
		alist.add(23.4);
		alist.add(3.4);
		alist.add(1.2);
		alist.add(2.3);
		
		System.out.println(alist);
		System.out.println(alist.isEmpty());
		System.out.println(alist.size());
		alist.set(1, 39.43);
		System.out.println(alist);
		alist.remove(0);
		System.out.println(alist);
		System.out.println(alist.get(1));
		System.out.println("---------------");
		for(double a:alist) {
			System.out.println(a);
		}
		for(int x=0; x<alist.size(); x++) {
			System.out.println(alist.get(x));
		}
		
		LinkedList obj=new LinkedList();
		obj.add(12);
		obj.add("niaber");
		obj.add(true);
		obj.add('a');
		obj.add(2, "bunu ortaya");
		System.out.println("------------------------");
		System.out.println(obj);
		obj.addAll(alist);
		System.out.println(obj);
		obj.addFirst("first");
		obj.addLast("last");
		
		System.out.println("--------it---------------");
		Iterator<Double> it=alist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(obj);
		obj.removeAll(alist);
		System.out.println(obj);
		
		System.out.println("----------next---list iter----------");
		ListIterator<Double> li=alist.listIterator(alist.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
