package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

abstract class Insurance{

	String	insuranceName;
	abstract void getQuote();
	abstract void cancelInsurance();

}
class Car extends Insurance{
	String carModel;
	@Override
	void getQuote() {
		System.out.println("your car insurance premium is $250");
	}
	@Override
	void cancelInsurance() {
		System.out.println("car policy cancelled");
	}
}
class Pet extends Insurance{
	String petType;
	@Override
	void getQuote() {
		System.out.println("your pet insurance premium is $100");
	}
	@Override
	void cancelInsurance() {
		System.out.println("pet policy cancelled");
	}
}
class Health extends Insurance{

	@Override
	void getQuote() {
		System.out.println("your health insurance premium is $1000");
	}
	@Override
	void cancelInsurance() {
		System.out.println("health policy cancelled");
	}
}
public class HW1 {

	public static void main(String[] args) {
		//Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour 
//		as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute 
//		as carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList. 
//		Using for loop/advanced for loop/ iterator access all methods of the class. 

		
		ArrayList<Insurance> a=new ArrayList<>();
		a.add(new Car());
		a.add(new Pet());
		a.add(new Health());
		
		for(int x=0; x<a.size(); x++) {
			a.get(x).getQuote();
			a.get(x).cancelInsurance();
		}System.out.println("---advanced for loop----");
		
		for(Insurance i:a) {
			i.getQuote();
			i.cancelInsurance();
		}System.out.println("---iterator----");
		
		Iterator<Insurance> it=a.iterator();
		Iterator<Insurance> at=a.iterator();
		while(it.hasNext()) {
			Insurance in=it.next();
			in.getQuote();
			in.cancelInsurance();
		}	
	}
}
