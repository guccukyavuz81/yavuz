package com.syntax.class08;
import java.util.Scanner;
public class Repl64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp;
	    int end=0;
	    System.out.print("Int:");
	    //write your code below
	    inp=new Scanner(System.in);
	    end=inp.nextInt();
	    int doubleEnd=2*(end);
	    for(end=0; end<doubleEnd; end++){
	      System.out.print(end+" ");
	}

}
}