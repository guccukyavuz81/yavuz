package com.syntax.class28;

import java.util.Vector;

public class VectorSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v=new Vector<>();
		v.add("hey");
		v.add("yoou");
		v.add("hey");
		v.add("bro");
		System.out.println(v);
		v.remove(1);
		System.out.println(v);
		v.remove("hey");
		System.out.println(v);
		


	}

}
