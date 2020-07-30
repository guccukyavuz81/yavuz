package com.syntax.class22;

public class Child extends Parent{
	private void hello() {
		System.out.println("child says hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p=new Parent();
		//p.hello(); not visible coz private
		Child c=new Child();
		c.hello();
}
}