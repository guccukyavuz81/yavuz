package com.syntax.class09;

public class ArrayReverse {

	public static void main(String[] args) {
// write a prg so that the elements of the array are printed in reverse order, starting with the last element.
	    
		int[] nums = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };
		for(int x=nums.length-1; x>=0; x--) {
			System.out.print(nums[x]+" ");
		}
	}

}
