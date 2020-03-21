package com.syntax.class12;
import java.util.Scanner;
public class Repl96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
		    
		    
		    String[] sp=s.split("");
		    for(int x=sp.length-1; x>=0; x--) {
		    	System.out.print(sp[x]);
		    }
		    
	}

}
