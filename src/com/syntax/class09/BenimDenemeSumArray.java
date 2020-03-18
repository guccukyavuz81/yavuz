package com.syntax.class09;

public class BenimDenemeSumArray {

	public static void main(String[] args) {
		// sum of the elements in an array
		
		
		int[] num= {5,10,15,20};
		int sum=0;
		for(int x=0; x<num.length; x++) {
			sum=sum+num[x];
			//System.out.println(sum);
			//burada olursa toplayarak her donuste bir print ediyor o anki toplami ama asagida sadece bir sonuc...
		}
         System.out.println(sum);
	}

}
