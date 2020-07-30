package com.syntax.class17;

public class Countobj {

	static int count;
	void meth() {
		count++;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Countobj a=new Countobj();
		Countobj b=new Countobj();
		Countobj c=new Countobj();
		a.meth();
		b.meth();
		c.meth();

	System.out.println(count);
		
	}

}
