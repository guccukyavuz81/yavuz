package com.syntax.class16;

public class Instance {
// this is instance variable coz its not inside of any method
	static String name;
	
	void s() {
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String name="necati";
		System.out.println("inside   "+name);
		Instance i=new Instance();
		i.name="abuzer";
		Instance j=new Instance();
		j.name="durriye";
		name="hayati";
		System.out.println("outside  "+i.name);
		i.s();
	}

}
