package com.syntax.class30;


import java.util.Map.Entry;
import java.util.*;

class Person{
	String name;
	String lastName;
	int age;
	int salary;
	public Person(String name, String lastName, int age, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	void display() {
		System.out.println("name is "+name+" lastname is "+lastName+" age is "+age+" salary is "+salary);
	}
}
public class HW1 {

	public static void main(String[] args) {
//Create a Person class with following private fields: name, lastName, age, salary. 
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map that will store key in ascending order. 
//In that map store personId and a Person Object. Print each object details.

		Person p1=new Person("Abuzer","Kilkuyruk",35, 95000);
		Person p2=new Person("Necati","Kulyutmaz",45, 75000);
		Person p3=new Person("Abidin","Tuyluoglu",39, 85000);


		Map<Integer, Person> m= new TreeMap<Integer, Person>();
		
		m.put(101, p1);
		m.put(103, p3);
		m.put(102, p2);
		
		for(Entry<Integer, Person> f:m.entrySet()) {
			System.out.println(f.getKey()); 
			f.getValue().display();
		}
		m.forEach((k,v)-> v.display());
		
		Set<Entry<Integer, Person>>  e=m.entrySet();
		Iterator<Entry<Integer, Person>> it=e.iterator();
		while(it.hasNext()) {
			Entry<Integer, Person> en=it.next();
			System.out.println(en.getKey());
			en.getValue().display(); 
		}
	}

}
