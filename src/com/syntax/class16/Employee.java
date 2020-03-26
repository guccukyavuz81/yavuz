package com.syntax.class16;

public class Employee {

	int eID;
	int Salary;
	//static String CEO="Sumair";   BOYLE DE OLUYOR METHOD LA DA ASAGIDAKI GIBI
	static String ceo() {
	String CEO="Sumair"	;
	return CEO;		
	}
	
	
	Employee(int eID,int Salary){
	this.eID=eID;
	this.Salary=Salary;
	}
	void display() {
		System.out.println("My eID is "+eID+" my salary is JUST  "+Salary+" and our CEO is "+ceo());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee(101,75000);
		Employee e2=new Employee(102,90000);
		e1.display();
		e2.display();
		

		
		
		
		
	}

}
