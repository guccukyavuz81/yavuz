package com.syntax.class17;
class tst{
	public static void main(String[] args) {
		Variables va=new Variables();
		va.color="black";
		va.memory=64;
		Variables.brand="nokia"; 
		Variables.touchscreen=true;
		Variables.display();
		va.displayspec();
	}
}
public class Variables {
	String color;
	int memory;
	static String brand;
	static boolean touchscreen;
	
	static void display() {
		System.out.println("we r building "+brand+" with touchscreen "+touchscreen);
	}
	void displayspec() {
		System.out.println("memory is "+memory+"GB and the color is "+color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		brand="iphone";
		touchscreen=true;
		Variables v=new Variables();
		v.color="grey";
		v.memory=128;
		display();
		v.displayspec();
	}

}
