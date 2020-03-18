package com.syntax.class09;

public class ArrWEbsiteCode {

	public static void main(String[] args) {
		// max value bulan prg yazalim

		int[] nums = { 1, 4, 3, 6, 8, 2, 5};
		  int max = nums[0];

		  for ( int x=0; x <nums.length; x++ ){ 
		    if ( nums[x] > max)   
		      max = nums[x];  
		  }
		  System.out.println(max); 
	}

}
