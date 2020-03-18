package com.syntax.class10;

public class StringCont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String c="   This is a string  ";
		
        System.out.println(c.length());
		System.out.println(c.toUpperCase());
        String d=c.toLowerCase();
        System.out.println(d);
        c=d;
        System.out.println(c+d);
        System.out.println(c.concat(d));
        String e=c.concat(d);
        System.out.println(e);
        
        String f="fkj";
        System.out.println(f.isEmpty());
        System.out.println(c.trim()+f);
	}


}
// concat is specific to strings you can't do concat to integers