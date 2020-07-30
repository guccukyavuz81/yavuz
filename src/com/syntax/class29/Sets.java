package com.syntax.class29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> city=new LinkedHashSet<>();
		city.add("Paris");
		city.add("Ankara");
		city.add("London");
		city.add("Amsterdam");
		city.add("Dhaka");
		
		System.out.println(city);
		System.out.println("----------cokomelli-------------------");
		
		Object[] arr=city.toArray();
		System.out.println(arr[2]);
		Arrays.sort(arr);
		System.out.println(arr[0]);
		
		System.out.println("------------sortlusu-----------------");
		
		List<String> l=new ArrayList<>(city);
		
		
		TreeSet<String> t=new TreeSet<>(city);
		System.out.println(t);
		
		ArrayList<String> a=new ArrayList<>(t);
		System.out.println(a.get(1));
		if(a.contains("Dhaka")) {
			System.out.println("eita okane ache");
		}
		
		
	}

}
