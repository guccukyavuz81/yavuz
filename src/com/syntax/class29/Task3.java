package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

class Student{
	String name;
	int studentID;
	public Student(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;
	}
	void display() {
		System.out.println("My name is "+name+" my studentID is "+studentID);
	}
	
}
public class Task3 {

	public static void main(String[] args) {
		//Create a Set collection that will hold Objects of Student Type. 
//		In this set we do not care about the insertion order. 
//		Each student object should have name and studentID. Display name of each student.


		HashSet<Student> h=new HashSet<>();
		h.add(new Student("Ali",121));
		h.add(new Student("Abuzer",122));
		h.add(new Student("Necati",123));
		
		Iterator<Student> it=h.iterator();
		while(it.hasNext()) {
			Student pupil=it.next();
			pupil.display();
			System.out.println(pupil.name);
		
		}




	}

}
