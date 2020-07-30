package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Cook{

	
	void salad() {
		System.out.println("makes salad");
	}
	void fries() {
		System.out.println("makes French fries");
	}
	void rice() {
		System.out.println("makes rice");
	}
}

class ItalianCook extends Cook{
	
	void fries() {
		System.out.println("changed his mind makes pasta instead");	
	}
	void pizza() {
		System.out.println("makes pizza");
	}
}
class TurkishCook extends Cook{
	
	void fries() {
		System.out.println("makes Turkish fries");
	}
	void rice() {
	System.out.println("makes bulgur");
	}
	
	String name="Abuzer";
	void nameOfTurkishCook() {
		System.out.println("Turkish cook's name is "+name);
	}
	void iskender() {
		System.out.println("makes iskender with molten butter on top");
	}
	
}
public class ReplaceDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cook c1=new Cook();
		Cook c2=new ItalianCook();
		Cook c3=new TurkishCook();
		
		List<Cook> lc=new ArrayList<Cook>();
		lc.add(c1);
		lc.add(c2);
		lc.add(c3);
		
		for(Cook c:lc) {
			c.fries();
			c.rice();
			c.salad();
			System.out.println("-------next cook plz-------");
		}
		
//		Iterator<Cook> it=lc.iterator();
//		while(it.hasNext()) {
//			it.next().fries();    //i inserted the other methods in fries coz when seperate didn't work coz of next issue
//			System.out.println("----next cook plz-------");
//		}
		
		
	}

}
