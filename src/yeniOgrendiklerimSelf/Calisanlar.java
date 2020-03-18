package yeniOgrendiklerimSelf;

class Employee{
	
	int id;
	String name;
	long salary;
	
	void data(int i, String n, long s){
	id=i;	
	name=n;
	salary=s;
	}
	void display() {
	System.out.println("benim adim  "+name+" numaram "+id+" maasim da "+salary+" gayme ");
	}
}


public class Calisanlar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.data(101, "Ali", 65000);
		e2.data(102, "Kemal", 45000);
		e3.data(103, "Ahmet", 90000);
		e1.display();
		e2.display();
		e3.display();
		
	}

}
