package com.syntax.class22;

public class Student {

	void study(){
		System.out.println("student studies");
	}
	void dohw(){
		System.out.println("student does hw");
	}
}
class SyntaxStudent extends Student{

	@Override
	void study() {
		System.out.println("Syntax student studies too");
	}
	void kafapatlat() {
		System.out.println("kafa patlatir");
	}
	
}
class CollegeStudent extends Student{

	@Override
	void dohw() {
		System.out.println("college student does hw too");
	}
	void party() {
		System.out.println("college student can party");
	}
	
}