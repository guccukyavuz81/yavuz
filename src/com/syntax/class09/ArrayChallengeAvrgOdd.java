package com.syntax.class09;

public class ArrayChallengeAvrgOdd {

	public static void main(String[] args) {
		// how to print average of odd numbers in given array int arr[] = {12,22,33,1,-2,3,8,11,9}

		int arr[] = {12,22,33,1,-2,3,8,11,9};
		int sum=0;
		int avrg=0;
		int odd=0;
		
		//for(int x:arr) {
		//if(x%2==1) {
		//odd++;
		//sum=sum+x;
		//avrg=sum/odd;
		//	}
		
		for(int x=0; x<arr.length; x++) {
			if(arr[x]%2==1) {
				odd++;
				sum=sum+arr[x];
				avrg=sum/odd;
			}
		
		}
		System.out.println(avrg);
		
		
		
		
		
		
	}

}
