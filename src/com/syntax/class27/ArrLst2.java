package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrLst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> choc=new ArrayList<>();
		choc.add("kinder");
		choc.add("godiva");
		choc.add("kit kat");
		choc.add("snickers");
		ArrayList<String> sweets=new ArrayList<>();
		sweets.add("icecream");
		sweets.add("cheesecake");
		sweets.addAll(choc);
		System.out.println(sweets.size());
		System.out.println(sweets);
		
		//we wanna get them backwards
		
		for(int x=sweets.size()-1; x>=0; x--) {
			System.out.println(sweets.get(x));
		}
		System.out.println("---------------------");
		for(String s:sweets) {
			System.out.println(s);
		}
		 Iterator<String> i=sweets.iterator();
			System.out.println("--before removing--");
			System.out.println(sweets);
			while(i.hasNext()) {
				if(i.next().equals("icecream")) {
					i.remove();
				}
		}
			System.out.println("----after removing icecream-----");
			System.out.println(sweets);
			
		

}
}