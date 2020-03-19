package com.syntax.class12;
import java.util.Scanner;
public class PrimeSaif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int i, m = 0, flag = 0;
		int n;
		do {
			System.out.println("Please enter a prime number: ");
			n = input.nextInt();
			flag=0;
			// it is the number to be checked  
			m = n / 2;
			if (n == 0 || n == 1 || n < 0) {
				System.out.println(n + " is not a prime number");
				flag = 1;
			} else {
				for (i = 2; i <= m; i++) {
					if (n % i == 0) {
						System.out.println(n + " is not a prime number");
						flag = 1;
						break;
					}
				}
			} // end of else
			if (flag == 0 && n > 1) {
				System.out.println(n + " is a prime number");
			}
		} while (flag == 1);
		input.close();
	}

}
