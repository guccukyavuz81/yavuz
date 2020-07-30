package com.syntax.class26;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrlist=new ArrayList<>();
		arrlist.add("niaber la");
		arrlist.add("oolum");
		System.out.println(arrlist.get(0)+arrlist.get(1));
		arrlist.add("corc");
		System.out.println(arrlist.get(0)+arrlist.get(1)+arrlist.get(2));
		System.out.println("i have "+arrlist.size()+" elements int the arrlist now");
		System.out.println(arrlist);
		arrlist.remove(1);
		System.out.println(arrlist);
		arrlist.set(1, "birak bu isleri");
		System.out.println(arrlist);
		arrlist.remove(0);
		System.out.println(arrlist);
		arrlist.add("dskjjfh");
		arrlist.add("jkfdhf");
		arrlist.add("oiuyhgf");
		System.out.println(arrlist);
		for(int x=0; x<arrlist.size(); x++) {
			System.out.println(arrlist.get(x));
		}




	}

}
