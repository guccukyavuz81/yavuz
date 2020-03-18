package com.syntax.class09;
import java.util.Scanner;
public class Repl77 {

	public static void main(String[] args) {
		// For you to do:
		//Create an array of integers that will store 5 elements taken from a user
		//Don't print any prompt message for the user
		//Then print out all the elements you have created in the first loop in reverse order. 


		Scanner input=new Scanner(System.in);
		int y=0;
		int [] nums=new int[5];
		for(int x=1; x<=nums.length; x++) {
			nums[y]=input.nextInt();
			y++;
		}
		for(y=nums.length-1; y>=0; y--)	{
			System.out.println(nums[y]);
		}
		
		
	}

}
