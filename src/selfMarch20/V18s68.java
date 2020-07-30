package selfMarch20;

import java.io.IOException;

public class V18s68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			method1();
		}
		catch(RuntimeException e) {
			System.out.println("A");
		}
		
	}

	public static void method1() {
		try {
			throw 3>10 ? new RuntimeException() : new IOException();
		}
		catch(IOException ie) {
			System.out.println("I");
		}catch(Exception re) {
			System.out.println("B");
		}
	}
}
