package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

abstract class Card{
	String creditCardType;
	public Card(String creditCardType) {
		this.creditCardType = creditCardType;
	}
	void paymet() {
		System.out.println("your "+creditCardType+" payment is due in 3 days");
	}
	abstract void process();
}
class AmericanExpress extends Card{

	public AmericanExpress(String creditCardType) {
		super(creditCardType);
	}
	@Override
	void process() {
		System.out.println(creditCardType+" payment processed");	
	}
}
class ChaseFreedom extends Card{

	public ChaseFreedom(String creditCardType) {
		super(creditCardType);
	}
	@Override
	void process() {
		System.out.println(creditCardType+" payment processed");
	}
}
class ChaseBusiness extends Card{

	public ChaseBusiness(String creditCardType) {
		super(creditCardType);
	}
	@Override
	void process() {
		System.out.println(creditCardType+" payment processed");
	}
}

public class HW2 {

	public static void main(String[] args) {
		// Create a Card class that will have implemented  and unimplemented methods and a constructor 
//		that will initializes credit card type.  Create 3 subclasses of a Card card. 
//		Create 3 objects of different card and store them into LinkedList. Using for loop/advanced for loop/ iterator 
//		access all methods of the class.

		
		
		LinkedList<Card> l=new LinkedList<Card>();
		l.add(new AmericanExpress("Amex"));
		l.add(new ChaseFreedom("Freedom"));
		l.add(new ChaseBusiness("Business"));
		
		for(int x=0; x<l.size(); x++) {
			l.get(x).paymet();
			l.get(x).process();
		}System.out.println("---------advanced for loop---------");
		
		for(Card ca:l) {
			ca.paymet();
			ca.process();
		}System.out.println("----------iterator---------------");
		
		Iterator<Card> it= l.iterator();
		while(it.hasNext()) {
			Card card=it.next();
			card.paymet();
			card.process();	
		}
		
	}

}
