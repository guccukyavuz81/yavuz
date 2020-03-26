package com.syntax.class16;

public class Local {

	void nameInside() {
		String name="John";
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(name); doesn't work coz it's local variable within the method above
		
		Local a=new Local();
		a.nameInside();	
		
		
		
		boolean flag=true;
		if(flag) {
			String answer="yes";
		}
		//System.out.println(answer); doesn't work -local in meth
		
		
	}

}
