package com.syntax.class12;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Cimbom oley mayislar bizimdir";
		for(int x=s.length()-1; x>=0; x--){
			System.out.print(s.charAt(x)+" ");
		}
		System.out.println();
		
		
		
		String [] sp=s.split(" ");
		for(int x=sp.length-1; x>=0; x--) {
			System.out.print(sp[x]+" ");
		}
		
		
	}

}
