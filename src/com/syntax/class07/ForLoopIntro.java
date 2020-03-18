package com.syntax.class07;

public class ForLoopIntro {

	public static void main(String[] args) {

		for (int x = 1; x <= 5; x++) {
			System.out.println("hi");
		}
		System.out.println("...........................");

		for (int y = 1; y <= 10; y++) {
			System.out.println(y);
		}
		System.out.println(".................................");

		for (int w = 10; w >= 1; w--) {
			System.out.println(w);
		}

		System.out.println(".........................................");

		for (int t = 0; t <= 50; t += 5) {
			System.out.println(t);
		}
		System.out.println(".............................................");

		int sum=0;
		for(int a=5; a<=50; a+=5) {
			sum=sum+a;
			
		}System.out.println(sum);
			
	}
}
