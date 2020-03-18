package com.syntax.class07;
import java.util.Scanner;
public class LuckyNumber {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
	int num;
	
	
	do {
	System.out.println("enter number");
	num=input.nextInt();	
		
	}while(num!=17); 
	System.out.println("got it");
	
	}

}
//executes at least once and comes to the while checks if not true stops
//burda ben int=17 deyip lucky kullanmayip num!=17 deyince calisti NEDEN? ONA BAK boyle de oluyor