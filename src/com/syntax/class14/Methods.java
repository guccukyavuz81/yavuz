package com.syntax.class14;

public class Methods {

	
	static int id;
	static String name;
	static String lastName;
	static int salary;
	static String title;
	
	static String working(){
	String w="working";
	return w;
	}
	static int sal(int ins) {
	return ins;	
	}
	static void display() {
	System.out.println("my name is "+name+lastName+"i am "+Methods.working()+" I make $"+salary+" I am the "+title+" and i have insurance worth "+Methods.sal(90000));	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods.id=101;
		Methods.name="abuzer";
		Methods.lastName="killica";
		Methods.salary=55000;
		Methods.title="manager";
		Methods.working();
		Methods.display();
		
	}

}
