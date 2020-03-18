package com.syntax.class09;
import java.util.Scanner;
public class ScannerArrayBenimDeneme {

	public static void main(String[] args) {

		int[] array=new int[4];
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter num");
		for(int x=0; x<4; x++) {
		array[x]=input.nextInt();
		}
		for(int num:array) {
		sum=sum+num;
		}
		System.out.println(sum);
		
		
		
		//BUNU OGREN ABICIM....
		
		
		
		
		
		
	}

}
