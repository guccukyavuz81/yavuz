package selfMarch20;

public class S71 {
public static final int MIN=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.out.println(args.length); 1 diyor
		int x=args.length;
		if (checkLimit(x)) {
			System.out.println("JAVA SE");
		}else {
			System.out.println("JAVA EE");
		}
		
	}
 
	public static boolean checkLimit(int x) {
		return (x>=MIN) ? true:false;
	}
}
// arguments a 1 koydum