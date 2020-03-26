package com.syntax.class15;

public class Larger {

	
	static int larger(int x,int y){
		int larger;
		if(x>y) {
		larger=x;
	}else {
         larger=y;	
         }return larger;
	}
	
	static boolean ev(int z) {
		boolean isEven;
		if(z%2==0) {
		isEven=true;
		}else {
		isEven=false;
		}return isEven;
	}
	static void pal(String s) {
        
		boolean palindrome;
		
		String withoutSpace=s.replaceAll(" ", "");
		System.out.println(withoutSpace);
		
		String[] sp=withoutSpace.split("");
		String r="";
		
		for(int x=withoutSpace.length()-1; x>=0; x--) {
		r+=sp[x];
		}
		if(r.equalsIgnoreCase(withoutSpace)) {
		palindrome=true;
		}else {
		palindrome=false;
		}
		System.out.println(palindrome);
	}
	
	static String hi(String lang) {
		if(lang=="english") {
			String e="hi";
			return e;
		}else if(lang=="german") {
			String g="hallo";
			return g;
		}else if(lang=="spanish") {
			String s="holla";
			return s;
	    }else {
	    	String o="o nasi dil la";
	    	return o;
	    }
		
}
	public static void main(String[] args) {
		System.out.println(hi("spanish"));
		System.out.println(larger(12, 21)+" is larger");
		ev(21);
		pal("never odd or even");
		System.out.println(hi("german"));
		System.out.println(ev(12));
	}
	
}
