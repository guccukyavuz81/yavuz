package selfMarch20;

public class MethDen {

	int x;
	static int meth(int a) {
		return a*a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	MethDen	m=new MethDen();
	m.x=5;
	System.out.println(meth(m.x));
	System.out.println(m.x);
	}

}
