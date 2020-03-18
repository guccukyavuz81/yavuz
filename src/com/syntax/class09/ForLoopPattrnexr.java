package com.syntax.class09;

public class ForLoopPattrnexr {

	public static void main(String[] args) {
		// Createanestedforloopsproducethefollowing output.....1
		//                                                 ...22
		 //                                                ..333
		 //                                                .4444
		  //                                               55555

		
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=5-x; y++) {
				System.out.print(" ");
			}
			for(int z=1; z<=x; z++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}

}
