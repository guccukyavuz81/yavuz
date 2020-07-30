package selfMarch20;

class Employee{
	public int salary;
}
class Manager extends Employee{
	public int budget;
}
class Director extends Manager{
	public int stockOptions;
}

public class V18s202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee=new Employee();
		Employee manager=new Manager();
		Employee director=new Director();
		
		employee.salary=3843;
		manager.salary=8540;
		director.salary=838;   //can only see the fields of the parent and any overloaded methods in child classes
	}

}
