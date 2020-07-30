package com.syntax.class19;

public class ConstrChaining {

	ConstrChaining(){
		this(2);
		System.out.println("non arg cons");
	}
	ConstrChaining(int x){
		this(4,7);
		System.out.println("const with 1 int");
	}
	ConstrChaining(int a, int b){
	     System.out.println("const with 2 int");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstrChaining c=new ConstrChaining();
		ConstrChaining d=new ConstrChaining(123);
		ConstrChaining e=new ConstrChaining(564,6573);
	}


}
