package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrLstCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cars=new ArrayList<>();
		cars.add("toyota");
		cars.add("lexus");
		cars.add("honda");
		cars.add("bmw");
		
		for(int x=0; x<cars.size(); x++) {
			System.out.println(cars.get(x));
		}
		System.out.println("-----1---------");
		for(String c:cars) {
			System.out.println(c);
		}
		System.out.println("------2----------");
		
		Iterator<String> it=cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------3------------");
		
		
		
		}

}
