package com.syntax.class21;

public class Teacher {

	String name,lastName,subject;
	
	Teacher(){
    System.out.println("parent constr");
	}
	Teacher(String name,String lastName){
		this.name=name;
		this.lastName=lastName;
	}
	void display() {
		System.out.println(name+lastName);
	}
	void son () {
		System.out.println(name+lastName+subject);
	}
}
