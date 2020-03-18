package com.syntax.class09;

public class ArrayEXmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]cities= {"washington dc","New York","Paris","Miami","Los Angeles"};
		
		System.out.println(cities[(cities.length-1)]);
		
		
		for(int x=1; x<cities.length; x++) {
			System.out.print(cities[x]+" ");
			
			
			
		}
	}

}
