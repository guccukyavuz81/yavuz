package com.syntax.class22;

public class Employee {

	int salary;
	void pay(int salary) {
		System.out.println("gets paid "+salary);
	}
}

class Contractor extends Employee{

	int hourly;

	void pay(int hourly) {
		System.out.println("gets paid "+hourly);
	}

	
	
	
}

