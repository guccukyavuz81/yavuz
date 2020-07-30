package com.syntax.class21;



class BMW extends Recap{
	String model;
	BMW(String model){
		super("maykil",35);
		this.model=model;	
		}
	BMW(String name,int age,String model){
		super(name,age);
		this.model=model;
	}
	void bas() {
		System.out.println(name+" bmw "+model+" siyim basarim "+age);
	}
	
}


public class Recap {

	String name;
	int age;
	
	Recap(String name,int age){
	this.name=name;
	this.age=age;
	}
	void meth() {
	System.out.println("do sth");	
	}
	void m() {
		this.meth();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recap r=new Recap("abuzer",39);
		r.m();
		BMW b=new BMW("X5");
		b.bas();
		BMW bm=new BMW("necati",45,"X7");
		bm.bas();
	}

}
