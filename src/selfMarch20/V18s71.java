package selfMarch20;

class C22 {
	public void displayC2() {
		System.out.println("C2");
	}
	
}
interface I{
	public void displayI();
}
class C11 extends C22 implements I{
	public void displayI() {
		System.out.println("C1");
	}
}

public class V18s71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C22 obj1=new C11();
		I obj2=new C11();
		//C22 s=obj2;   //Type mismatch: cannot convert from I to C2
		//I t=obj1;    //Type mismatch: cannot convert from C2 to I
		//C22 s=(C22)obj2; // java.lang.ClassCastException: selfMarch20.C1 cannot be cast to selfMarch20.C2
		I t=(I)obj1;   //this can be cast without issue
		t.displayI();
		//s.displayC2();
	}

}
