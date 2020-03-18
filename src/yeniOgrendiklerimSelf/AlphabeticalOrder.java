package yeniOgrendiklerimSelf;
import java.util.Scanner;
public class AlphabeticalOrder {

	public static void main(String[] args) {
		// put cities in alphabetical order with user input

		Scanner input=new Scanner(System.in);
		System.out.println("enter first city");
		String x=input.next();
		System.out.println("enter second city");
		String y=input.next();
		
		if(x.compareTo(y)<0) {
			System.out.println("cities in alphabetical order are: "+x+" "+y);
		}else {
			System.out.println("cities in alphabetical order are: "+y+" "+x);

		}
	}

}
