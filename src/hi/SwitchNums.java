package hi;

public class SwitchNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		int c=a+b;
		a=c-a;
		b=c-b;
		System.out.println("new a is "+a);
		System.out.println("new b is "+b);
		
		String x="hi";
		String y="bye";
		String z=x+y;
		x=z.substring(x.length());
		y=z.substring(0, x.length()-1);
		System.out.println(x);
		System.out.println(y);
	}

}
