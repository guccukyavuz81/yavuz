package yeniOgrendiklerimSelf;
import java.util.Scanner;
public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("two cities plz");
		String x= input.next();
		String y= input.next();
		
		if(x.compareToIgnoreCase(y)<0) {
			System.out.println(x+" "+y);
		}else {
			System.out.println(y+" "+x);
		}
	}

}
