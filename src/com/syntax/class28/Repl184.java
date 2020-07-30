package com.syntax.class28;

import java.util.LinkedList;

public class Repl184 {

	public static void main(String[] args) {

		int a=0;
		int b=1;
		int c;
		LinkedList<Integer> li=new LinkedList<>();
		li.add(a);
		li.add(b);
		
		for(int x=2; x<10; x++) {
			c=a+b;
			li.add(x, c);
			a=b;
			b=c;
		}
		
		System.out.println(li);
		
	}

}
