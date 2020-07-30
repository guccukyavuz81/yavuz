package yeniOgrendiklerimSelf;

class Employee{
	
	int id;
	String name;
	long salary;
	
	Employee(int i, String n, long s){
	id=i;	
	name=n;
	salary=s;
	}
	public String toString() {
	return "benim adim  "+name+" numaram "+id+" maasim da "+salary+" gayme ";
	}
}


public class Calisanlar extends Employee {

	Calisanlar(){
		super(1234,"necati",85000);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(101,"ali",65000);
		Employee e2=new Employee(102,"ahmet",95000);
		Employee e3=new Employee(103,"veli",45000);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		Calisanlar c=new Calisanlar();
		System.out.println(c.toString());

		
	}
	

}
