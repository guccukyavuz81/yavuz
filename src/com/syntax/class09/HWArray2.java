package com.syntax.class09;

public class HWArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words= {"Java ", "Saturday ", "day","coding ","is "};
		System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);
		
		for(String x:words) {
			System.out.print(x+"   ");
		}
	}

}
