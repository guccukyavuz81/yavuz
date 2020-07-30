 package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrListWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> w=new ArrayList<>();
		w.add("people");
		w.add("apple");
		w.add("car");
		
		Iterator<String> it=w.iterator();
		
		while(it.hasNext()) {
			if(it.next().endsWith("e")) {
				it.remove();
			}
		}
		System.out.println(w);
	}

}
