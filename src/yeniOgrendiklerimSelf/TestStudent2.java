package yeniOgrendiklerimSelf;

class Studen {

	static int id=101;
	static String name="abuziddin";
	
	void speak() {
		//for(int x=1; x<4; x++) {
			//System.out.println("hello my name is "+name+" and my id is "+id);
	//	}	
	}
	static boolean sampiyon() {
		//System.out.println("sampiyon CIMBOM");
		boolean cimbom=true;
		return cimbom;
	}
	
	static int calc() {
		int iddouble=id*2;
		return iddouble;
	}
	static int getId() {
		return id;
	}
	String getName() {
		return name;
	}
}
public class TestStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Studen s1=new Studen();
		//Studen s2=new Studen();
		//s1.id=101;
		//s2.id=102;
		//s1.name="abuzer";
		//s2.name="abidin";
		//s1.speak();
		//s2.speak();
		//s1.sampiyon();
		//s2.sampiyon();
		//System.out.println(s1.id+" "+s1.name);
		//System.out.println(s2.id+" "+s2.name);
		//int a=s1.calc();
		//System.out.println(a);
		//int b=s2.calc();
		//System.out.println(b);
		//String isim=s1.getName();
		//System.out.println(isim);
		//String isim2=s2.getName();
		//System.out.println(isim2);
		//System.out.println("................................");
		//System.out.println(s1.sampiyon());
		
		System.out.println(Studen.id);
		System.out.println(Studen.name);
		System.out.println(Studen.calc());
		System.out.println(Studen.sampiyon());
		
		//s1.calc();  bu void oldugunda calisiyor
		//s2.calc();     void
	}
}
// here s1 and s2 are reference variables and they get the HEAP MEMORY and the id and names get the HEAP MEMORY 

//public keyword makes the method public so that it can be accessed from outside of the class
//static keyword denotes that the method can be accessed without creating the object of the class
//class is the blueprint(OR TEMPLATE) from which the object is made

// once i create the method above,all objects will be able to run it(like each student saying hello)
//methods have access to the data(name,id) and the objects have the access to the methods and the data