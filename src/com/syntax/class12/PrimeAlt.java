package com.syntax.class12;
import java.util.Scanner;
public class PrimeAlt {

	public static void main(String[] args) {
		// CALISMIYOR BU

		 // Write a java program to check whether a given number is prime or not?
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        number = scan.nextInt();
        boolean flag = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                //flag = true;
                //break;
            }
        }
        if (!flag) {
            System.out.println("prime");
        } else {
            System.out.println("Not prime");

	}

}
}