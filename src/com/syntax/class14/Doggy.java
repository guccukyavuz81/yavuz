package com.syntax.class14;

class Dog{
	
	String breed;
	String color;
	String name;
	int age;
	int radius;
	Dog(String breed,String color,String name,int age){
	this.breed=breed;
	this.color=color;
	this.name=name;
	this.age=age;
	}
	void display (){
	System.out.println("i am "+name+" my breed is "+breed+" my color is "+color+" my age is "+age+" my calculation is "+radius*radius*3.14);	
	}
	Dog(String breed,String color,String name,int age,int radius){
    this(breed,color,name,age);
	this.radius=radius;
	
	}
	
	//double area() {
		// double area=radius*radius*3.14;
		 //   return area;
	}


public class Doggy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d1=new Dog ("french","black","comar",5,10);
		Dog d2=new Dog ("german","brown","canavar",3,20);
		d1.display();
		d2.display();
		
		//Dog d3=new Dog(5);
		//System.out.println("my dog can calculate the area of a circle with radius 5 as "+d3.area());
	}

}
