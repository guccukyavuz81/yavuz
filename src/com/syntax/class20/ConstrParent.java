package com.syntax.class20;
class Car{
	String make,model;
	Car(){
		System.out.println("i am the parent car class");
	}
	Car(String make,String model){
		this.make=make;
		this.model=model;
	}
	void display() {
		System.out.println(make+" "+model);
	}
}
class BMW extends Car{
	String sportModel;
	BMW(){
		System.out.println("i'm the child class BMW");
	}
	BMW(String sportModel){
    super("BMW","x5");
	this.sportModel=sportModel;
	}
	void display2() {
		System.out.println(make+" "+model+" "+sportModel);
	}
	BMW(String make,String model,String sportmodel){
		super(make,model);
		this.sportModel=sportmodel;
	}
}
public class ConstrParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c=new Car();
		Car d=new Car("toyota","camry");
		d.display();
		BMW w=new BMW("L");
		System.out.println("...........................");
		w.display(); //parent class taki method 2 variable olan--onu da kullanabilir 
		w.display2();
		BMW b=new BMW();
		BMW z=new BMW("Lexus","RX","330");
		z.display2();	
		
	}

}
