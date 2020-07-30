package com.syntax.class30;

import java.util.ArrayList;
import java.util.List;

class Student{
	String studentId;
	String name;
	String lastName;
	public Student(String studentId, String name, String lastName) {
		this.studentId = studentId;
		this.name = name;
		this.lastName = lastName;
	}
	void display() {
		System.out.println("Student details: "+name+" "+lastName+" with id: "+studentId);
	}
}
public class Repl194 {

	public static void main(String[] args) {
		// Create a student class that will have 
//		variables as studentId, name and lastName
//		constructor
//		method to display students details
//
//		Create a set that will store 5 different students in an order they been added to the collection.
//
//		Execute method to display students details
//
//		Expected Output:
//		Student details: Samir Jawaid with id: 101
//		Student details: Asel Umurzakova with id: 102
//		Student details: Diego Juarez with id: 103
//		Student details: Sohil Aryan with id: 104
//		Student details: Alijon Nazarov with id: 105
		
		List<Student> s=new ArrayList<Student>();
		s.add(new Student("101", "Samir", "Jawaid"));
		s.add(new Student("102", "Asel", "Umurzakova"));
		s.add(new Student("103", "Diego", "Juarez"));
		s.add(new Student("104", "Sohil", "Aryan"));
		s.add(new Student("105", "Alijon", "Nazarov"));
		
		for(Student st:s) {
			st.display();
		}

	}

}
