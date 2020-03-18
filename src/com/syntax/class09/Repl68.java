package com.syntax.class09;

public class Repl68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int x=1; x<=4; x++){
			
			for(int y=1; y<=4; y++){
				if(((x==2) && (y==2)) || ((x==2) && (y==3)) || ((x==3)&&(y==2)) || ((x==3)&&(y==3))) {
					System.out.print(" ");	
				}else {
					System.out.print("$");	
				}
		        }System.out.println();
				
	}
	}
}



//if(((x==2) && (y==2)) || ((x==2) && (y==3)) || ((x==3)&&(y==2)) || ((x==3)&&(y==3))){