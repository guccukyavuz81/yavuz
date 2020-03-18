package com.syntax.class08;
import java.util.Scanner;
public class Repl63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner inp;
	     int x ;
	    System.out.print("In:");
	    //write code under on step 8
	    inp=new Scanner(System.in);
	    x=inp.nextInt();
	    int y=x-1;
	    for(x=0; x<=y; x++){
	      System.out.print(x+" ");
	    }
	}

}
