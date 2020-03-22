package com.syntax.class15;

public class Method {

	static void speak() {
		for(int x=1; x<=10; x++)
		System.out.println("welcome");
	}
	
	static void sipik(int times, String word) {
		for(int x=1; x<=times; x++) {
			System.out.println(word);
		}	
	}
	static void rain(boolean isRaining) {
		if(isRaining) {
		System.out.println("stay home");
				
		}else {
			System.out.println("walk");
		}
	}
}

