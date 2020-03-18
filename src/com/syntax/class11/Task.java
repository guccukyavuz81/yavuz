package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
		
        //2.Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
        
		String a="Gencler bugun haybeye 2 puan kaybettik!!!**!!!...";
		
		String b=a.replaceAll("[^A-Za-z]", "");
		
		System.out.println(b);
		System.out.println(b.length());
		}
		
	}


