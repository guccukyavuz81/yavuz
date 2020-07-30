package selfMarch20;

public class V18s20 {

	int a1;
	public static void doProduct(int a) {
		a=a*a;
	}
	public static void doString (String s) {
		s.concat(" "+s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V18s20 t=new V18s20();
		t.a1=11;
		String sb="Hello";
		Integer i=10;
		doProduct(i);
		doString(sb);
		doProduct(t.a1);
		System.out.println(i+" "+sb+" "+t.a1);
	}

}
