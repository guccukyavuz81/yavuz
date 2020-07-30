package com.syntax.class18;
class Student{
	String name;
	int math;
	int science;
	int beden;
	Student(String name,int math,int science,int beden){
	this.name=name;
	this.math=math;
	this.science=science;
	this.beden=beden;
	}
	int calc() {
	int average=(math+science+beden)/3;
	return average; 
	}
	void display() {
	System.out.println(name+" got "+math+" in math "+science+" in science "+beden+" in beden and his average is  "+calc());	
	}}
public class Task2 {
	public static void main(String[] args) {
//Write a java program of Class Students that takes students name and 3 subject grades. 
//Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students
		//with different marks. Your program should print an average mark of each students name.
		Student s1=new Student("Kemal",75,87,100);
		s1.display();
		Student s2=new Student("Ali",95,98,100);
		s2.display();
		Student s3=new Student("Necati",55,66,100);
		s3.display();
		Student s4=new Student("Abuzer",45,83,100);
		s4.display();
		Student s5=new Student("Ilhan",90,35,100);
		s5.display();
	}

}
