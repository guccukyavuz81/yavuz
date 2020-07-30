package com.syntax.class30;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Repl198 {

	public static void main(String[] args) {
		//Create Map in which we want to store keys in Ascending order
//		Add the below values
//		1 item = apple
//		2 item = banana
//		3 item = pear
//		4 item = tomato
//		5 item = mango
//		6 item: kiwi
//
//		Extract all keys and it values and print them in the format below:
//
//		Expected Output:
//		Key is 1 item and values is apple
//		Key is 2 item and values is banana
//		Key is 3 item and values is pear
//		Key is 4 item and values is tomato
//		Key is 5 item and values is mango
//		Key is 6 item and values is kiwi

		Map<String, String> m=new TreeMap<String, String>();
		m.put("1 item", "apple");
		m.put("2 item", "banana");
		m.put("3 item", "pear");
		m.put("4 item", "tomato");
		m.put("5 item", "mango");
		m.put("6 item", "kiwi");
		
		Set<Entry<String, String>> s=m.entrySet();
		for(Entry<String, String> f:s) {
			System.out.println("Key is "+f.getKey()+" and values is "+f.getValue());
		}
	}

}
