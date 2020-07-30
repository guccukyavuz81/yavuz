package com.syntax.class22;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer [] pc= {new Apple(),new Lenovo(),new HP(),new Dell()};
		for(Computer com:pc) {
			com.run();
			com.code();
			System.out.println("..........................................");
		}
	}

}
