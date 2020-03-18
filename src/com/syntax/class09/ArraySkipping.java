package com.syntax.class09;

public class ArraySkipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

	    for ( int x= 0 ; x < nums.length ; x+=2  )
	      System.out.print(  nums[x] + "  "  );
	}

}
