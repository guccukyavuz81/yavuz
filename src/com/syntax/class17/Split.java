package com.syntax.class17;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="bununla da oluyor olmuyor diye bisey yok orda spesifik bir sorun var";
		String[]sp=s.split("");
		for(int x=0; x<sp.length; x++) {
			System.out.println(sp[x]);
		}
	}

}
