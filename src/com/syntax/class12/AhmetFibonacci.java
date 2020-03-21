package com.syntax.class12;

public class AhmetFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int number = 10, num1 = 0, num2 = 1;
	     //   System.out.print("First " + number + " terms: ");
	        for (int i = 1; i <= number; ++i)
	        {
	            System.out.print(num1 + " ");
	            int sum = num1 + num2;
	            num1 = num2;
	            num2 = sum;

	}

}
}