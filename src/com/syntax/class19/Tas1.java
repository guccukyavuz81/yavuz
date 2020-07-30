package com.syntax.class19;
class Student{
	String name;
	String address;
	Student(String name,String address){
	this.name=name;
	this.address=address;
	}
	void display() {
		System.out.println("name is "+name+" address is "+ address);
	}
}
public class Tas1 {

	public static void main(String[] args) {
		//Write program as a Student class   that has instance variables name and address.
		//Create a constructor that will initialize those variables. Print name & address of given  
		//                                                                           student using displayInfo method.

		Student s=new Student("abuzittin","dskjfhdjfadjjfakjdasjddldj");
		s.display();

	}

}
