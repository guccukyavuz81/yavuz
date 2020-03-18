package hi;
import java.util.Scanner;
public class SwitchReview {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		double num1=0.0;
		double num2=0.0;
		double result=0.0;
		String operator;
		System.out.println("enter number");
		num1=input.nextDouble();
		System.out.println("enter num2");
		num2=input.nextDouble();
		System.out.println("enter operator");
		operator=input.next();
		
		switch(operator) {
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;	
			
		default:
			System.out.println("wrong opr");
		
		//BUNUN DEFAULT UNU NASIL YAPMISLAR BIR BAK(RESULT VERMEDEN)
		
		}
		System.out.println(result);
	}

}
