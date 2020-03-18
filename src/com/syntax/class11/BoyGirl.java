package com.syntax.class11;
import java.util.Scanner;
public class BoyGirl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("mom's name");
		String momName=input.next();
		System.out.println("dad's name");
		String dadName=input.next();
		System.out.println("boy girl?");
		String boyGirl=input.next();
		
		    if(boyGirl.equals("boy")) {
			System.out.println("name suggestion :" + dadName.substring(0, dadName.length()/2)+momName.substring(momName.length()/2));	
		    }else {
			System.out.println();
			System.out.println("name suggestion :" +momName.substring(0, momName.length()/2)+dadName.substring(dadName.length()/2));
		    }
		
	}

}
