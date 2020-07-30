package com.syntax.class22;

public class TestDegree {

	public static void main(String[] args) {
//	    Create a class ‘Degree’ having a method ‘getPrerequisite’ that prints
//		“”To get a degree you need high school diploma”“. 
//		Class ‘Degree’ has 2 subclasses namely ‘Bachelors’ and Masters’. 
//		In Masters class override method ‘getPrerequisite’.
//		Call the method by creating an object of each of the three classes.

		Degree d=new Degree();
		d.getPrerequisite();
		Bachelors b=new Bachelors();
		b.getPrerequisite();
		Masters m=new Masters();
		m.getPrerequisite();
	}

}
