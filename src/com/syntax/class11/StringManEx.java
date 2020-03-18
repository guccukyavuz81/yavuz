package com.syntax.class11;
import java.util.Scanner;

import yeniOgrendiklerimSelf.Split;
public class StringManEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String q="WE LOST POINTS THIS WEEK GUYS";
		//Scanner input=new Scanner(System.in);
		//String c=input.next();
		//String [] s=c.split(" ");
		String[] s=q.split(" ");
		for(int x=0; x<s.length; x++) {
			System.out.print(s[x]);
		}
		
	}

}
