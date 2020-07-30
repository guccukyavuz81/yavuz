package com.syntax.class19;

public class ConstrCall {

	ConstrCall(){
		System.out.println("non arg cons");
	}
	ConstrCall(String t){
		this();
	}
	ConstrCall(String s,int x){
	this("jfj");      // works with this(s); too
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstrCall c=new ConstrCall("dkjfk");
		ConstrCall d=new ConstrCall("kjd",4);
	}

}
