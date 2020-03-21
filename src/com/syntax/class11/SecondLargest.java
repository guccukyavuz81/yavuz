package com.syntax.class11;

public class SecondLargest {

	public static void main(String[] args) {
		// CALISMIYOR FIX IT

		int [] nums= {91,23,30,31,62,58};
		int min=nums[0];
		int largest=0;
		int seclarg=0;
		//int largest=nums[0];
		//int seclarg=nums[0];
		
		int secmin=nums[0];
		for(int x=0; x<nums.length; x++) {
		if(nums[x]>largest) {
			seclarg=largest;
			largest=nums[x];
		}
		else if(nums[x]>seclarg) {
		seclarg=nums[x];
		}
		else if(nums[x]<min) {
			secmin=min;
			min=nums[x];
		}
		}
		System.out.println("largest: "+largest);
		System.out.println("second largest: "+seclarg);
		System.out.println("min:  "+min);
		System.out.println("secmin:  "+secmin);
	}

}
