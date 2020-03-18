package com.syntax.class11;

public class StringManpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String f="fener shampiyon 1905";
		String c=f.replaceAll("fener", "Cimbom");
		System.out.println(c);
		
		String r=c.replaceAll("[A-Z]", "");
        System.out.println(r);
        String rr=c.replaceAll("[a-z]", "");
        System.out.println(rr);
        String rrr=c.replaceAll("[0-9]", "");
        System.out.println(rrr);
        System.out.println(".................................................");
        String rrrr=c.replaceAll("[^A-Za-z]", "");
        System.out.println(rrrr);
        System.out.println("...............................................");
        String rrrrr=c.replaceAll("[^0-9]", "");
        System.out.println(rrrrr);
        
        
        System.out.println("....................");
		String [] s=c.split(" ");
		for(int x=0; x<s.length; x++) {
			System.out.println(s[x]);
		}
		
	}

}
