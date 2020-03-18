package com.syntax.class08;

public class ArrayPractice {

	public static void main(String[] args) {   
		// TODO Auto-generated method stub

		String[] cars= {"volvo","bmw","opel"};
	
		System.out.println(cars[0]);
		System.out.println("...............................");
		
		for(int x=0; x<cars.length; x++) {
			System.out.println(cars[x]);
		}
		
		System.out.println("......................");
		
		System.out.println(cars.length);
		System.out.println("..........................................");
		
		for(String arabalar:cars) {
			System.out.println(arabalar);
		}
		System.out.println(".............................................");
		
		int [] numbers= {1,3,5,7};
		for(int sayilar:numbers) {
		System.out.println(sayilar);	
		}
		System.out.println(".....................................");
		
		for(int x=0; x<numbers.length; x++) {
			System.out.println(numbers[x]);
		}
		System.out.println("...................................");
		
		System.out.println(numbers[1 ]);
	}
}
