package com.syntax.class25;

public class IntfcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drivable d=new Car();
		d.drive();
		Vehicles v=new Car();
		v.drive();
		v.stop();
		
		Car c =new Car();
		c.drive();
		c.stop();
		System.out.println(c.MOVE_FAST);
	}

}
