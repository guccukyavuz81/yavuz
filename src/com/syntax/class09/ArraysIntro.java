package com.syntax.class09;

public class ArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] numbers= {1,2,3,4};
		//System.out.println(numbers[0]);
		
		int [] numbers=new int[4];
		
		numbers[0]=1;
		numbers[1]=2;
		//System.out.println(numbers[1]+" "+numbers[0]);
		for(int x:numbers) {
			System.out.print(x+" ");
		}
		//int [][] nums=new int [2][3];
		//nums[0][0]=1;
		//nums[0][1]=2;
		//System.out.println(nums[0][0]+" "+nums[0][1]);
		//System.out.println("---------------------------------");
		//System.out.println(nums[0][2]);
		
	}

}
