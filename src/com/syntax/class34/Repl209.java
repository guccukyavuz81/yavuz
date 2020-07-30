package com.syntax.class34;

public class Repl209 {

	static void tempcheck(int temp) throws RuntimeException{
	if(temp<32)	{
	throw new RuntimeException("It is freezing");
	}
	}
	public static void main(String[] args) {
// Create a method that will do temperature check. Anytime user passes temperture that is below 32 method should 
//throw an Exception saying "It is freezing
//In Main method call the method and handle an Exception
//Expected Output: 
//java.lang.RuntimeException: It is freezing

	try {
	tempcheck(31);
	}catch(RuntimeException r) {
		System.out.println(r);
	}
	}

}
