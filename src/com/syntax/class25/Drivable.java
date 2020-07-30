package com.syntax.class25;

public interface Drivable {

	boolean MOVE_FAST=true;
	void drive();
}
abstract class Vehicles implements Drivable{
	abstract void stop();
}
class Car extends Vehicles{

	@Override
	public void drive() {
		System.out.println("Car drives");
	}
	@Override
	void stop() {
		System.out.println("Car stops");
	}
}
