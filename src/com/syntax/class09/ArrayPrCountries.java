package com.syntax.class09;

public class ArrayPrCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] countries= {"turkey--> ","russia--> ","syria--> "};
		String[] capitals= {"ankara","moscow","damascus"};
		int x,y=0;
		for(x=0; x<countries.length; x++) {
			for(y=0; y<capitals.length; y++){
				if(x==y) {
					System.out.println(countries[x]+capitals[y]);
				}
				
			}
			
		}
	
	}
}
