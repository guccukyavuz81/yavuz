package com.syntax.class09;

public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruits= {"banana","apple","mango","kiwi"};
		//for(String x:fruits) {
			//System.out.println(x);
		for(int x=0; x<fruits.length; x++) {
			//System.out.println(fruits[x]);
		//burada x== da calisti(ilginc)
		//if(x.equals("apple")) {
			
			if(x==1) {
			System.out.println(fruits[x]+" is favorite fruit");
		}else {
			System.out.println(fruits[x]+" not favorite");
		}
	}
	}
}
