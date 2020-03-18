package com.syntax.class07;

public class ReturnGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(grade(97.87));
		System.out.println(grade(69.99));
		System.out.println(grade(86.43));
		System.out.println(grade(75.71));
	
	}
		public static  char grade (double x) {
			
			    char grade;
				if(x>=90) {
				grade='A';
				}else if(x>=80) {
				grade='B';
				}else if(x>=70) {
				grade='C';
				}else {
				grade='F';
				}
				return grade;		
									
}
}


