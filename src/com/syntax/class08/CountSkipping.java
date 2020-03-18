package com.syntax.class08;

public class CountSkipping {

	public static void main(String[] args) {
		// 1 to 100 skip 35-55

		for(int x=1; x<=100; x++) {
			if(x>=35 && x<=55) {
				continue;
			}
			System.out.println(x);
		}
	}

}
