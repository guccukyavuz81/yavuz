package com.syntax.class18;

public class MetdStrArr {

	static int sum(int [] array) {
		int sum=0;
		for(int x=0; x<array.length; x++) {
			sum=sum+array[x];	
		}
		return sum;
	}
	static String reverse(String s) {
		String rev="";
		for(int x=s.length()-1; x>=0; x--) {
		rev+=s.charAt(x);	
		}return rev;
	}
	static String vow(String st) {
		String vowel=st.replaceAll("[^aAeEiIoOuU]", "");
		return vowel;
	}
	static String par(String str, String c) {
		String [] sp=str.split("");
		String p="";
		for(int x=0; x<sp.length; x++) {
		String w="("+sp[x]+")";
		if(sp[x].equals(c)) {
		sp[x]=w;	
		}p+=sp[x];
		}return p;
	}
	
	
	public static void main(String[] args) {
		// SON METHOD I TAMAMLA

		int [] array= {12,32,54,73};
		System.out.println(sum(array));
		System.out.println(reverse("niaber la"));
		System.out.println(vow("niaber la"));
		String str="naber niabiyon";
		System.out.println(par("naber niabiyon","a"));
		
	}

}
