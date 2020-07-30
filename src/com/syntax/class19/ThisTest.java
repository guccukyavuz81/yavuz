package com.syntax.class19;

public class ThisTest {

	int x;
	int y;
	
	ThisTest(int x, int y){
	this.x=x;
	this.y=y;
	}
	void top() {
	System.out.println("ins var sum "+(x+y));	
	}
	
	void sum(int a, int b) {
	System.out.println("local var sum "+(a+b));	
	}
	ThisTest(){
	System.out.println("non arg const");	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest t=new ThisTest(3,5);
		t.top();
		t.sum(50, 60);
		ThisTest tt=new ThisTest();
	}

}
