package com.syntax.class08;

public class BreakLoop {

	public static void main(String[] args) {
		//we want to stop the loop once it reaches 4

		for(int x=1; x<=10; x++) {
			if(x==4) { 
				System.out.println("stop here!!!");
				break;
				//break; olmazsa 10 a kadar devam ediyor if olmasina ragmen
				//System.out.println(x); burdayken calismiyor
			}System.out.println(x);
			//syso burdaydi iceri aldim denemek icin
		}
		System.out.println("i'm out");
	}

}
