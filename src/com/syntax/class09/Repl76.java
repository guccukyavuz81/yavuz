package com.syntax.class09;
import java.util.Scanner;
public class Repl76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		  Scanner input=new Scanner(System.in);
	      int y=0;
		  String[] days=new String[7];
	      for(int x=1; x<=days.length; x++) {
	    	System.out.println("Please enter day "+x+" of the week");
		    days[y]=input.next();
		    y++;
	      }
	      for(y=0; y<days.length; y++) {
	    	  System.out.println(days[y]);
	      }
	      
	}

}
