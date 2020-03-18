package com.syntax.class11;

public class TaskQuestionsAlternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String b=a.replace("?", "Q");
		System.out.println(b);
		String[] s=b.split("Q");
		
		for(int x=0; x<s.length; x++) {
			System.out.println(s[x]);
		}
		
		System.out.println("num of sentences is :"+s.length);
	}

}
