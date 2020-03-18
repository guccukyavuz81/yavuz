package com.syntax.class08;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sayilar= {10,20,30,40};
		
		int toplam=0;
		for(int dizi:sayilar) {
		toplam = toplam + dizi;
		//System.out.print(toplam+" ");
		}
		System.out.print("aha da bu dizideki sayilarin toplami "+toplam);
}
}