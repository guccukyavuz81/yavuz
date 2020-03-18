package yeniOgrendiklerimSelf;

class Student{
	String name;
	int age;
	void speak() {
	System.out.println("mayneymiz   "+ name+" mayeyciz "+age);	
		
	};
	
}

public class TestClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		Student s2=new Student();

		s1.name="Maykil";
		s2.name="Corc";
		s1.age=15;
		s2.age=39;
		s2.speak();
		s1.speak();

	}

}
