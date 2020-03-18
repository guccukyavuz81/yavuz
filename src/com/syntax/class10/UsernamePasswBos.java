package com.syntax.class10;

import java.util.Scanner;

public class UsernamePasswBos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="kemalyavuz";
		String u=null;
		Scanner input=new Scanner(System.in);
		System.out.println("enter username");
		u=input.next();
		if(u.isEmpty()) {
		System.out.println("username cannot be empty");
		}else {
			System.out.println("password");
			String p=input.next();
			if(u.isEmpty()) {
			System.out.println("password cannot be empty");	
			}
			int l=p.length();
			if(l<8) {
			System.out.println("password too short");	
			}else {
				if(p.contains(u)){
					System.out.println("password can't contain username");	
					}
					if(p.equalsIgnoreCase(x)) {
						System.out.println("pass confirmed");
						System.out.println("your username and pass created");
					}else {
						System.out.println("pass don't match");
					}	
			}
			
		}
	}

}
