package com.syntax.class22;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cars c=new Mercedes("Mercedes");
		Cars t=new Tesla("Tesla");
		Lexus L=new Lexus("Lexus");
		c.start();
		t.start();
		L.start();
		System.out.println(".....................................");

		Cars[] cars= {new Mercedes("Mercedes"),new Tesla("Tesla"),new Lexus("Lexus")};
		for(Cars cr:cars) {
			cr.start();
			cr.display();
			System.out.println(".............................");
		}
			
//			for(int x=0; x<cars.length; x++) {
//				cars[x].start();
//				cars[x].display();	
//		}  ya da boyle
	}

}
