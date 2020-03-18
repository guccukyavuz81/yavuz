package com.syntax.class09;
import java.util.Scanner;
public class ScanArrayMaxMin {

	public static void main(String[] args) {
		// diyelim ki user 5 tane int girsin biz de bunun max value bulan prg yazalim

		int[] nums=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("enter 5 nums plz");
		for(int x=0; x<5; x++) {
			nums[x]=input.nextInt();
		}
		int max=nums[0];
		for(int y=0; y<nums.length; y++) {
		if(nums[y]>max) {
		max=nums[y];
		}
		//for(int m:nums) {
			//if(m>max) {
			  // max=m;
			//}
	}
		System.out.println(max);
		
	}

}
