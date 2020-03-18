package com.syntax.class09;

public class ArrayPrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums= {200,30,-1,900,56,787};
		
			int y=nums[0];
			for(int x=0; x<nums.length; x++) {
				
				if(nums[x]>y) {
					y=nums[x];	
				}	
				System.out.println(y);
				//burada olursa 6 kere print ediyor sonuc dogru ama tekrar olmamasi icin asagiya koyuyoruz...
			}
			//System.out.println(y);
		}
	}


//Buna mutlaka bak cok onemli......