package com.syntax.class16;

public class MethRec {

	int lrgst(int[] array) {
		int largest=array[0];
		for(int x=0; x<array.length; x++) {
			if(array[x]>largest) {
				largest=array[x];
			}
		}return largest;
	}
	String[] words(String str) {
		String [] array=str.split(" ");
		return array;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethRec m= new MethRec();
		
		int [] arr= {10,20,38,12};
		System.out.println(m.lrgst(arr));
		
		
		String [] array =m.words("bu ne la");
		
		for(int x=0; x<array.length; x++) {
		System.out.println(array[x]);
		}
		
		
	}

}
