package yeniOgrendiklerimSelf;

class Stud{
	
	//data name age       behavior(action)-->method()
	
	static String name="kemal";
	static int age=39;
	
	//void speak() {
    //.out.println(age);	
	//}
	
	static int summ(int x, int y) {
		int sum=x+y;
		return sum;
	}
	static int mull(int a, int b) {
		int multt=a*b;
		return multt;
	}

	static boolean takim() {
		boolean cimbom=true;
		return cimbom;
	}
	
}

public class Studentt {

	// class--object--method...
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Stud s1=new Stud();
		//Stud s2=new Stud();
		//s1.name="Ahmet";
		//s2.name="Kemal";
		//s1.age=35;
		//s2.age=39;
		//s1.speak();
		//s2.speak();
		System.out.println(Stud.summ(13, 31));
		System.out.println(Stud.summ(32, 55));
		System.out.println(Stud.mull(12, 5));
		System.out.println(Stud.mull(23, 7));
		System.out.println(Stud.takim());
		System.out.println(Stud.name);
		System.out.println(Stud.age );
		
	}

	

}
