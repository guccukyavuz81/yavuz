package com.syntax.class22;

public class Parent {

	private void hello() {
		System.out.println("parent says hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p=new Parent();
		p.hello();
		Child c=new Child();
	//	c.hello();  The method hello() from the type Child is not visible coz private
}
}