package hi;
import java.util.Scanner;
public class DoWhilePrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int x;
		int sum=0;
		do {
			System.out.println("enter num");
			x=input.nextInt();
			sum=sum+x;	
		}while(x!=-1);
		
		System.out.println("sum is "+sum);
	}

}
