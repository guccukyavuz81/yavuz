package com.syntax.class22;

public class Computer {

	void run() {
		System.out.println("computer runs");
	}
	void code() {
		System.out.println("computer codes");
	}
	
}
class Apple extends Computer{
	void run() {
		System.out.println("Apple runs");
	}
}
class Lenovo extends Computer{
	void run() {
		System.out.println("Lenovo runs");
	}
	void code() {
		System.out.println("Lenovo codes");
	}
	void spec() {
		System.out.println("this is from lenovo and not gonna pop up");
	}
}
class HP extends Computer{
	void run() {
		System.out.println("HP runs");
	}
}
class Dell extends Computer{
	void run() {
		System.out.println("Dell runs");
	}
	void code() {
		System.out.println("Dell codes");
	}
	void sp() {
		System.out.println("this is from dell and not gonna pop up");
	}
}