package com.syntax.class15;

public class MethodsIntro {

	static int add(int x, int y){
		int sum=x+y;
		return sum;
	}
static void display() {
	
	System.out.println("the addition of these numbers  equals to  "+MethodsIntro.add(123, 456));
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(MethodsIntro.add(123456789, 987654321));
		MethodsIntro.display();
	}

}
