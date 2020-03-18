package com.syntax.class09;

public class DenemewebsiteArrySum {

	public static void main(String[] args) {
		// how to find sum of first 5 elements of an array{1,2,3,4,5,6,7,8,9,10} in java using for-each?

		
		
		int [] nums= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int x=0; x<5; x++) {
			
			sum=sum+nums[x];
		}
		System.out.println(sum);
	}

}
