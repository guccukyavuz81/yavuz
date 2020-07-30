package com.syntax.class28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Drinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> drinks=new ArrayList<>();
		drinks.add("juice");
		drinks.add("vodka");
		drinks.add("cola");
		drinks.add("milk");
//BU ITERATOR LA OLMUYOR O ANCAK REMOVE ICIN IYI CALISIYOR ama if cond in icine iki tane it.next dedigimizde hata veriyor
		Collections.sort(drinks);
		for(String d:drinks) {
			if(d.contains("a")||d.contains("e")) {
				d=d.replaceAll(d, "water");
			}System.out.println(d);   
 //bu loop un icindeyken calisiyor ama disarda drinks i print ettigimizde replace edilmemis ilk halini print ediyor
		}System.out.println(drinks);                 //burda bir etkisi olmuyor ama loop icinde replace edip basiyor
		System.out.println("-------ustteki advanced loop------------");
		
		for(int x=0; x<drinks.size();x++) {
			if(drinks.get(x).contains("a")||drinks.get(x).contains("e")) {
				drinks.set(x, "water");
			}  System.out.println(drinks.get(x));                             
        }System.out.println(drinks);                         //classic loop ta her ikisi de calisiyor
}
}