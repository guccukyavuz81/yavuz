package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

class Student{ 
	  int rollno; 
	  String name; 
	  int age; 
	  Student(int rollno,String name,int age){ 
	   this.rollno=rollno; 
	   this.name=name; 
	   this.age=age; 
	  }
	  void display() {
		  System.out.println(rollno+name+age);
	  }
	} 

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Student s1=new Student(101," Sonoo ",23); 
		  Student s2=new Student(102," Ravi ",21); 
		  Student s3=new Student(103," Hanumat ",25); 
		
		
		
		LinkedList<Student> s=new LinkedList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		Iterator<Student> it=s.iterator();
		while(it.hasNext()) {
			it.next().display();
		}
		
		
	}

}
