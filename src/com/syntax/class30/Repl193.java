package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repl193 {

	public static void main(String[] args) {
//		// Create a Set collection in which you want to preserve an order of inserted String Objects.
//		Add the below values 
//		null
//		Sohil 
//		Diego
//		Alijon
//		Asel
//		Sumair 

		List<String> l=new ArrayList<String>();
		l.add(null);
		l.add("Sohil");
		l.add("Diego");
		l.add("Alijon");
		l.add("Asel");
		l.add("Sumair");
		
		for(String s:l) {
			System.out.println(s);
		}
		Iterator<String> it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
