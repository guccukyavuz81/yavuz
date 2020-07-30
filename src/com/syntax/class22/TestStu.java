package com.syntax.class22;

public class TestStu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		s.study();
		s.dohw();
		SyntaxStudent sn=new SyntaxStudent();
		sn.study();
		sn.dohw();
		sn.kafapatlat();
		CollegeStudent c=new CollegeStudent();
		c.study();
		c.dohw();
		c.party();
		Student cs=new CollegeStudent();
		cs.study();
		cs.dohw();
		
		//CollegeStudent cst=(CollegeStudent)s;
		//cst.study();
		//cst.dohw();
		//cst.party(); Student cannot be cast to 
		//              com.syntax.class22.CollegeStudent
	}

}
