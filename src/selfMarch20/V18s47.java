package selfMarch20;

class C1{
	
}
class C2 extends C1{
	
}
class C3 extends C2{
	
}
public class V18s47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj1=(C1) new C2();
		C2 obj2=(C2) new C3();
		C2 obj3=(C2) new C1();
		C3 obj4=(C3) obj2;
	}

}
