package com.syntax.class07;

public class Denemeler {

	public static void main(String[] args) {
		// finding length of the string
		String x="naber";
		System.out.println(x.length());
		
		System.out.println("...........................................");
		
		//converting string to uppercase
		
		String st="niaber";
		System.out.println(st.toUpperCase());
		
		System.out.println("........................................");
		//finding the position f a letter in a string(if 1st letter it shows 0 if 3rd shows 2....(1 less)
		String s="eyy";
		System.out.println(s.indexOf("e"));
		
		System.out.println(".................................");
		
		//finding max
		int i=20;
		int y=15;
		System.out.println(Math.max(i,y));
		//finding square root
		int w=25;
		System.out.println(Math.sqrt(w));
		
		System.out.println(".....................................");
		//verifying the comparison between the numbers(here it prints false)
		
		int z=12;
		int b=17;
		System.out.println(z>b);
		
		//insert the missing parts to complete the following "short hand if...else statement" (ternary operator):
		
		int a=12;
		int e=19;
		String result=(a>e)? "hi" : "bye";
		System.out.println(result);
		
		System.out.println("...................");
		
		// Loop through the items in the cars array
		
		String[] cars = {"Volvo", "BMW", "Ford"};
		for (String c : cars) {
			System.out.println(c);
			}
		  
		  System.out.println("....USTTE.............");
		  
		  //Print the second item in the cars array.
		 
		  String[] car = {"Volvo", "BMW", "Ford"};
		  System.out.println(car[0]);
		  
		  System.out.println("...................................");
		  
		  //Change the value from "Volvo" to "Opel", in the cars array.

          String[] carz = {"Volvo", "BMW", "Ford"};
		  carz[0]= "Opel";
		  System.out.println(carz[0]);
		  System.out.println("....................................");
		  
		 //Find out how many elements the cars array have.


		  String[] carr = {"Volvo", "BMW", "Ford" ,"djfhdf", "kqdie"};
		  System.out.println(carr.length);
		  
		  System.out.println("............................");
		  
		  int [] nums= {1,3,5,7};
		  for(int u:nums) {
			  System.out.println(u);
		  }
		  System.out.println("..............................");
		  
		  System.out.println(nums[2]);    
		  System.out.println(nums[0]);
	}

}
