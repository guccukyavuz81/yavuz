package com.syntax.class28;

import java.util.ArrayList;
import java.util.List;

public class ReplacDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> x=new ArrayList<String>();
		x.add("naber");
		x.add("kocum");
		x.add("naber");
		x.add("ne");
		x.add("ayaksin");
		x.set(1, "bro");
		x.removeIf(str->str.contains("naber"));                //using lambda expression removes all that applies
		System.out.println(x);                                 //but remove.object removes first element that matches
		for(String s:x) {
			if(s.contains("a")||s.contains("o")) {
				s=s.replace(s, "yerine");
			}System.out.println(s);
		}
		System.out.println(x);  //icerde replace edip basiyor disarda list in ilk halini veriyor replace edilmemis olarak
		
		for(int a=0; a<x.size(); a++) {
			if(x.get(a).contains("a")||x.get(a).contains("o")) {
				x.set(a, "substitute");
			}System.out.println(x.get(a));	
		}System.out.println(x);     //bu hem icerde hem disarda replace edilmis olarak calisiyor
		
	}

}
