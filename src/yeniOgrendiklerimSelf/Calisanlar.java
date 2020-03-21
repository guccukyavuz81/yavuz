package yeniOgrendiklerimSelf;

class Employee{
	
	int id;
	String name;
	long salary;
	
	Employee(int id, String name, long salary){
	this.id=id;	
	this.name=name;
	this.salary=salary;
	}
	void display() {
	System.out.println("benim adim  "+name+" numaram "+id+" maasim da "+salary+" gayme ");
	}
}


public class Calisanlar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(101,"ali",65000);
		Employee e2=new Employee(102,"ahmet",95000);
		Employee e3=new Employee(103,"veli",45000);
		
		e1.display();
		e2.display();
		e3.display();
		
	}

}
