package com.syntax.class30;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee{
	private String FullName;
	private long ssn;
	private double salary;
	Employee(String FullName, long ssn,double salary){
		this.FullName=FullName;
		this.ssn=ssn;
		this.salary=salary;
	}
	String getFullName() {
		return FullName;
	}
	long getssn() {
		return ssn;
	}
	double getsalary() {
		return salary;
	}
}
public class Repl195 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create an Employee class that will be fully encapsulated and will have:
//			variables as FullName, ssn and salary
//			constructor to initialize instance variables
//			getters to have an access to instance variables
//
//			Create a set collection that will store # objects of Employee type and using Iterator print the value of each variable
//
//			Expected Output:
//			John Doe
//			123456789
//			80000.0
//			Jane Smith
//			987654321
//			90000.0
//			Jackie Chan
//			0
//			1000000.0
		
		Set<Employee> em=new HashSet<>();
		em.add(new Employee("John Doe", 123456789, 80000.0));
		em.add(new Employee("Jane Smith", 987654321, 90000.0));
		em.add(new Employee("Jackie Chan", 0, 1000000.0));
		
		Iterator<Employee> it=em.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println(e.getFullName());
			System.out.println(e.getssn());
			System.out.println(e.getsalary());
		}
	}

}
