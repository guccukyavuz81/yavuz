package com.syntax.class09;

public class HWArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//char[] grades=new char[6];
		//grades[0]='A';
		//grades[1]='B';
		//grades[2]='C';
		//grades[3]='D';
		//grades[4]='E';
		//grades[5]='F';
		
		char[] grades= {'A','B','C','D','E','F'};
		System.out.println(grades[1]);
		for(char x:grades) {
			System.out.print(x+" ");
		}
	}

}
