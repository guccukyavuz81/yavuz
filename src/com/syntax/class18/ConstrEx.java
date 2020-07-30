package com.syntax.class18;

public class ConstrEx {

	
	
	ConstrEx(){
	System.out.println(" ay em da forst konstractir ");
	}
	
	ConstrEx(int x){
		System.out.println(" ay em da "+x+"nd konstractir ");
		}
	ConstrEx(int x, String y){
		System.out.println(" ay em da "+x+" rd konstractir vit veri sipesil pirapirtiis "+y);
		}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstrEx c=new ConstrEx();
		ConstrEx d=new ConstrEx(2);
		ConstrEx e=new ConstrEx(3,"huahahahaha");


	}

}
