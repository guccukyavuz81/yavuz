package com.syntax.class27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrLstDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a=new ArrayList<>();
		a.add("icecream");
		a.add("chocolate");
		a.add("cake");
		System.out.println("first alphabetically is "+Collections.min(a)+" and last is "+Collections.max(a));
		Iterator<String> it=a.iterator();
		while(it.hasNext()) {
			if(it.next().contains("icecream")||it.next().contains("cake")) {
				it.remove();
			}
		}
		System.out.println(a);
		

		
		
	}

}
