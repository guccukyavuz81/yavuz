package com.syntax.class09;
import java.util.Scanner;
public class ArryScannerAvrgOdd {

	public static void main(String[] args) {
		// user dan 5 input isteyip array yapip odd olanlarin avrg hesaplatalim

		Scanner input=new Scanner(System.in);
		System.out.println("plz enter 5 nums");
		int sum=0;
		int avrg=0;
		int odd=0;
		int [] nums= new int[5];
		for(int x=0; x<nums.length; x++) {
		nums[x]=input.nextInt();
		}
		
		for(int x=0; x<nums.length; x++) {
		if(nums[x]%2==1) {
		odd++;	
		sum=sum+nums[x];
		avrg=sum/odd;
		}
		}
		System.out.println(avrg);
		
	}

}
