package com.syntax.class34;

class SyntaxStudentException extends Throwable{
	SyntaxStudentException(String str){
		super(str);
	}
}
public class Repl210 {

	static void gradecheck(int grade) throws SyntaxStudentException{
		if(grade>90) {
			throw new SyntaxStudentException("You are an exceptionally awesome student");
		}else {
			System.out.println("You are a great student");
		}
	}
	public static void main(String[] args) {
		// Create a custom Exception class
//		In main class create a method that will check students grade
//		if students grade is >90 then below exception should be thrown
//		if students grade is below 90 print "You are a great student"
//
//		In main method calls method gradeCheck and handle an Exception
//
//		Expected Output:
//		SyntaxStudentException: You are an exceptionally awesome student

		try {
			gradecheck(91);	
		}catch(SyntaxStudentException s) {
			System.out.println(s);
		}
		
	}

}
