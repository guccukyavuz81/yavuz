package com.syntax.class09;
import java.util.Scanner;
public class Repl78 {

	public static void main(String[] args) {
		// Create an int array of integers with a size of 5 and input values with Scanner. 
		//Don't print prompt questions for a user.
		//Using loop print out each element of the array that should look like the output below

 
		Scanner input=new Scanner(System.in);
		int[] nums=new int[5];
		int y=0;
		int x=1;
		for(x=1; x<=nums.length; x++) {
			nums[y]=input.nextInt();
			y++;
		}
		
       for(y=0; y<nums.length; y++) {
    	  System.out.println(nums[y]*10); 
       }
}
}