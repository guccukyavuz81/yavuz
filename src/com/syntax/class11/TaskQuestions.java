package com.syntax.class11;

public class TaskQuestions {

	public static void main(String[] args) {
		//3.You have a String a=“Is it saturday? Is it raining? Do we have a Java Class today?” 
				//How would you find out how many sentences are in that String?
		
		
		 String str = "abracadabra. alakazam";
		    String target1 = "dab";
		    String target2 = "ABRA";
		    
		    System.out.println(str.indexOf("c"));
		    System.out.println(str.indexOf("."));
		    System.out.println(str.indexOf("dab"));
		    System.out.println(str.indexOf("ABRA"));
	}

}
