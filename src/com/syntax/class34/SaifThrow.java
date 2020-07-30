package com.syntax.class34;

public class SaifThrow {

	

    public static void ageVerification(int age) {
	if (age<16) {
		throw new RuntimeException("You are not eligible for DL");
	}else {
		System.out.println("You can apply for DL");
	}
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ageVerification(18);
		ageVerification(15);
	}

}
