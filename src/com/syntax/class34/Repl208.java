package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Repl208 {

	static void meth() throws FileNotFoundException  {
		String filePath="";
		FileInputStream input=new FileInputStream(filePath);
	}
	public static void main(String[] args) {
		// Create a method that will not be handling exception and throwing it at caller.
//		In main method call method and handle the exception.
//		Expected Output:
//		java.io.FileNotFoundException:  (No such file or directory)

		try {
		meth();	
		}catch(FileNotFoundException f) {
			System.out.println(f);
		}
		
		
	}

}
