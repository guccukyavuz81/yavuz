package com.syntax.class17;

public class ObjCountMethOverl {

	static int count;
	{count++;}
	void meth() {
	}
	
	void meth(int a) {
	}
	void meth(String b) {
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjCountMethOverl a=new ObjCountMethOverl();
		ObjCountMethOverl b=new ObjCountMethOverl();
		ObjCountMethOverl c=new ObjCountMethOverl();
		a.meth();
		b.meth(3);
		c.meth("aks");

	System.out.println(count);
		
	}


}
