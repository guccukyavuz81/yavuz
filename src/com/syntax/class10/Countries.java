package com.syntax.class10;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter=0;
		String [][] countries= {{"us","canada"},
				                {"brazil","uruguay","peru"},
				                {"england","france","italy"},
				                {"turkey","kazakystan","russia"},
				                {"mali","nigeria"}};
		
		//for(int x=0; x<countries.length; x++) {
			//for(int y=0; y<countries[x].length; y++) {
				//System.out.print(countries[x][y]+" ");
		
		for(String a[]:countries) {
			for(String b:a) {
			System.out.print(b+" ");	
		    counter++;
			}System.out.println();
		}System.out.println("num of countries : "+counter);
	}

}
