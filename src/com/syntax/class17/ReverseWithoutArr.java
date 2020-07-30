package com.syntax.class17;
import java.util.Scanner;
public class ReverseWithoutArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp=new Scanner(System.in);
		String s;
		System.out.println("enter");
		s=inp.nextLine();
		String rev="";
		for(int x=s.length()-1; x>=0; x--) {
		rev+=s.charAt(x);
		}
		System.out.println(rev);
		
	}

}
