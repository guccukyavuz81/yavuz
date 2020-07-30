package com.syntax.class22;

public class TestCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditCard c=new CreditCard();
		c.balance=10000;
		System.out.println(c.meth());
		Visa v=new Visa();
		v.balance=150000;
		System.out.println(v.meth());
		AX a=new AX();
		a.balance=200000;
		System.out.println(a.meth());
		System.out.println("......................alternative.....................");
		Alt al=new Alt();
		System.out.println(al.meth(30000,0.25));
		Visaa vis=new Visaa();
		System.out.println(al.meth(40000,0.15));
		AXX ax=new AXX();
		System.out.println(ax.meth(120000, 0.45));
		System.out.println(".............oburalt.......................");
		
		Oburalt ob=new Oburalt(30000,0.12);
		System.out.println(ob.meth());
		Visaaa visa=new Visaaa(40000,0.55);
		System.out.println(visa.meth());
		AXXX axx=new AXXX(30000,0.12);
		System.out.println(axx.meth());
	}

}
