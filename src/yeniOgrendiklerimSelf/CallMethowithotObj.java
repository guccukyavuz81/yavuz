package yeniOgrendiklerimSelf;

class Deneme{
	
	
	
	
	static void method(String name,int age) {
		System.out.println("my name is "+name+" im "+age+" years old u can call me by the class name without the object because i'm static");
	}
}
public class CallMethowithotObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Deneme.method("STATIC",25);
		
	}

}
