package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e){	
		System.out.println("caught interruptedexception");
	}
	
	System.out.println("move on to the next try block");
	
	String fPath="";
	try {
		FileInputStream input=new FileInputStream(fPath);
	}catch(FileNotFoundException fne) {
		System.out.println("caught filenotfoundexception");
	}
	
	int a=10;
	int b=0;
	
	try {
		System.out.println(a/b);
		System.out.println("i'm the code inside the try block");    //doesnt get executed coz it jumps out of the block
	}catch(ArithmeticException ae) {                     //Throwable t works too coz its the grandparent
		System.out.println("caught arithmeticexception");
	}
	System.out.println("end of the program");
}

}
