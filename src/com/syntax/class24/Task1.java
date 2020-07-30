package com.syntax.class24;
interface Device{
	abstract void download();
	abstract void upload();	
}
abstract class Computer implements Device{

	String brand;
	int ram;
	public Computer(String brand, int ram) {
		this.brand = brand;
		this.ram = ram;
	}
	void run(){
		System.out.println(brand+ram+" runs");
	}
	void process(){
		System.out.println(brand+ram+" processes");
	}
}
class Apple extends Computer{

	public Apple(String brand, int ram) {
		super(brand, ram);
	}
	@Override
	public void download() {
		System.out.println(brand+ram+" pis download eder");
	}
	@Override
	public void upload() {
		System.out.println(brand+ram+" pis upload eder acimaz");	
	}
}
class Lenovo extends Computer{

	public Lenovo(String brand, int ram) {
		super(brand, ram);
	}

	@Override
	public void download() {
		System.out.println(brand+ram+" iyi ceker");
	}
	@Override
	public void upload() {
		System.out.println(brand+ram+" manyak yukler");	
	}
}
class HP extends Computer{

	public HP(String brand, int ram) {
		super(brand, ram);
		System.out.println();
	}
	@Override
	public void download() {
        System.out.println(ram+brand+" ayipsin indirir");		
	}
	@Override
	public void upload() {
        System.out.println(ram+brand+" oo manyak iter");		
	}
}
class Dell extends Computer{

	public Dell(String brand, int ram) {
		super(brand, ram);
       	}
	@Override
	public void download() {
		System.out.println(ram+brand+" yarar gecer indirir");		
	}
	@Override
	public void upload() {
		System.out.println(ram+brand+" acayip yukler");
	}
}
public class Task1 {

	public static void main(String[] args) {
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.

		Computer [] comp= {new Apple("mac",16),new Lenovo("thinkpad",8),new HP("heycpi",4),new Dell("kraldell",32)};
		for(Computer c:comp) {
			c.run();
			c.process();
			c.download();
			c.upload();
			System.out.println("--------------------------------------");
		}
	}

}
