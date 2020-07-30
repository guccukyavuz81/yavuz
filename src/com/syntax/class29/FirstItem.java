package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class FirstItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar=new ArrayList<>();
		ar.add("marhaba");
		ar.add("mekenj");
		ar.add("madrasa");
		
		
		HashSet<String> h=new HashSet<>(ar);
		h.add("Hi");
		h.add("Bye");
		h.add("Hi");
		h.add("naber");
		h.add("bro");
		
		System.out.println(h);
		
		Iterator<String> it=h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}System.out.println("-----adv loop-----");
		for(String s:h) {
			System.out.println(s);
		}System.out.println("-------treee------");
		
		TreeSet<String> t=new TreeSet<>(h);
		System.out.println(t);
		
	}

}
