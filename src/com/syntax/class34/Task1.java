package com.syntax.class34;

public class Task1 {

	 static void ageval(int age) {
		 if(age<16) {
			 throw new RuntimeException("too small dude");
		 }else {
			 System.out.println("no issues");
		 }
	 }
	   
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ageval(17);
		ageval(14);
	  }
}


