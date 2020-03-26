package com.syntax.class16;

public class Students {

	String name;
	int ID;
	static int num;
	
	Students(String name,int ID){
	this.name=name;
	this.ID=ID;
	}
	void display() {
	num++;
	System.out.println("my name is "+name+" my ID is "+ID+" and I'm the student number "+num);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s1=new Students("Ahmet",101);
		Students s2=new Students("Ali",102);
		Students s3=new Students("Abuzer",103);
		s1.display();
		s2.display();
		s3.display();

	}

}
