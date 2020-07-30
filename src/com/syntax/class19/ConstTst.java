package com.syntax.class19;

public class ConstTst {

	String name;
	int age;
	ConstTst(String name, int age){
	this.name=name;
	this.age=age;
	}
	void display(){
		System.out.println(name+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstTst c=new ConstTst("sjhd",14);
		c.display();
	}

}
