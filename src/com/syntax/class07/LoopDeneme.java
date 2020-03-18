package com.syntax.class07;

public class LoopDeneme {

	public static void main(String[] args) {

		int num=1;
		while(num<=50) {
			System.out.println(num);
			num++;
		}
		System.out.println("........................................");
		int num1=20;
		while(num1<=30) {
		System.out.println(num1);	
		num1++;
		}
		System.out.println("............................................");
		
		int num2=1;
		while(num2<=10) {
			System.out.print(" "+num2);
			num2++;
		}
		System.out.println("................................................");
		
		int num3=1;
		while(num3<20) {
			System.out.println(num3);
			num3+=2;
				
		}
		System.out.println(".mod yolu.....................");
		
		//int num4=1;
		//while(num4<20) {
			
			//if(num4 %2 !=0) {
				//System.out.println(num4);
			
			//}num4++;
			//aynisi for la da calisti
			
			for(int number=0; number<=20; number++) {
				if(number%2!=0) {
					System.out.println(number);
				}
			}
			
		
	}

}
