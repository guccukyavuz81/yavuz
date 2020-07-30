package com.syntax.class17;

public class Task2 {

	public static String meth(String s) {
	String[]sp=s.split("");
	String rev="";
	for(int x=s.length()-1; x>=0; x--) {
	rev+=sp[x];
	}return rev;
		
			
	}
	
	
	public static void main(String[] args) {
		//Create a method that will take a String as a parameter and returns reverse String. 
		//Method should be available to all classes within your projects and accessible by class name.

	System.out.println(Task2.meth("naber kocum"));
	}

}
