package com.syntax.class24;

abstract class Vehicle{
static int counter;
String color;
public Vehicle(String color) {
this.color = color;
counter++;
	}
void drive() {
	System.out.println(color+" vehicle drives");
}
void stop() {
	System.out.println(color+" vehicle stops");
}
static void num() {
	System.out.println("we made "+counter+" cars");
}
abstract void start();
abstract void brake();
}
class Bus extends Vehicle{

	public Bus(String color) {
		super(color);
	}

	@Override
	void start() {
       System.out.println(color+" bus starts emitting black fumes");		
	}

	@Override
	void brake() {
		System.out.println(color+" bus brakes with noise");
		
	}
}
class SchoolBus extends Bus{

	public SchoolBus(String color) {
		super(color);
	}
	void drive() {
		System.out.println(color+" school bus drives slow");
	}
	void stop() {
		System.out.println(color+" school bus stops frequently");
	}
}
abstract class Car extends Vehicle{

	String brand;
	public Car(String color, String brand) {
	super(color);
	this.brand=brand;
}
	void brake() {
		System.out.println("car brakes");
	}
	
}
class Tesla extends Car{

	String fuel;
	String type;
	public Tesla(String color, String brand, String type, String fuel) {
		super(color, brand);
		this.type = type;
		this.fuel = fuel;
	}
	public Tesla(String color, String brand) {
		super(color, brand);
	}
	
	@Override
	void drive() {
		System.out.println(color+ " "+ brand+" car drives silently");
	}
	@Override
	void start() {
		System.out.println(brand+color+" starts smoothly");
		
	}

	@Override
	void brake() {
        System.out.println(brand+color+" brakes hard");		
	}
	void display() {
		System.out.println(brand+" brand car runs on "+fuel+" and its color is "+color+" and it is a "+type+" type of car");
		num();
	}
}
class Toyota extends Car{

	public Toyota(String color, String brand) {
		super(color, brand);
	}

	@Override
	void start() {
		System.out.println(color+brand+" starts fast");
	}

	@Override
	void brake() {
		System.out.println(color+brand+" brakes smoothly ??");
	}
	
}

public class CarAbst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle [] veh= {new Tesla("black","tesla"),new Toyota("grey","toyota"),new Bus("blue"),new SchoolBus("yellow")};
		for(Vehicle v:veh) {
			v.drive();
			v.stop();
			v.start();
			v.brake();
			System.out.println("--------------------------------");
		}
		Tesla t=new Tesla("silver","tesla","sedan","electric");
		t.display();
		
	}

}
