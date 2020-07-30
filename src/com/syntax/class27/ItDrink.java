package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ItDrink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> drinks=new ArrayList<>();
		drinks.add("juice");
		drinks.add("vodka");
		drinks.add("cola");
		drinks.add("milk");
		
		Iterator<String> it=drinks.iterator();
		while(it.hasNext()) {
			if(it.next().contains("a")) {
				it.remove();	
	}	
}System.out.println(drinks);
}
}