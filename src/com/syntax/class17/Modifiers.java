package com.syntax.class17;
class Testt{
	
	public static void main(String[] args) {
	Modifiers n=new Modifiers();
	n.name="maykil";
	n.lastname="ivanowski";
	n.salary=95000;
	n.method1();
	n.method2();
	n.method3();
	n.display();
	}
}
public class Modifiers {

	public String name;
	protected String lastname;
	double salary;
	private long ssn;
	void display() {
		System.out.println(name+"   "+lastname+"    "+ssn+"   "+salary);
	}
	public static void method1() {
		System.out.println("public");
	}
	protected void method2() {
		System.out.println("protected");
	}	
	void method3() {
		System.out.println("default");
	}
	private void method4() {
		System.out.println("private");
	}	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		Modifiers m=new Modifiers();
		m.name="john";
		m.lastname="smith";
		m.salary=90000;
		m.ssn=9484757363l;
		m.method1();
		m.method2();
		m.method3();
		m.method4();
		m.display();
		
	}

}
