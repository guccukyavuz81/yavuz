package com.syntax.class34;
import java.util.Scanner;
public class Task2 {

	static void checkusername(String name){
		if(name.length()<5) {
			throw new RuntimeException("should be 5 characters min");
		}else {
			System.out.println("go ahead");
		}
		System.out.println("rest of the code");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("enter username");
		String name=input.next();
		try {
			checkusername(name);	
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("=====the other rest=====");
	}

}
