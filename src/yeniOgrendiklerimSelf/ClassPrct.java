package yeniOgrendiklerimSelf;
    class Person{
	// classes contain data-name,age.. and methods(subroutines)-speak,
	
	String name;
	int age;
	boolean fener=true;
	boolean cimbom=true;
    void speak() {
    System.out.println("my name is "+name+ "and i'm "+age+" years old");
    }
	
	void takim() {
	fener=false;
			
	}
	}
public class ClassPrct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1=new Person();
		p1.name="abidin";
		p1.age=35;
		Person p2=new Person();
		p2.name="necati";
		p2.age=39;
		System.out.println(p2.name+p2.age);
		System.out.println(p1.name+p1.age);
		System.out.println("............................................");
		
		p1.speak();
		p2.speak();
		System.out.println(p1.cimbom);
		System.out.println(p2.fener);
		System.out.println("..............................................");
		p1.takim();
		System.out.println(p1.fener);
	}
  
}
