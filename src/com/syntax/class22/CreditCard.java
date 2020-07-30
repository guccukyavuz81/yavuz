package com.syntax.class22;

public class CreditCard {

	int balance;
	double interest;
	
	double meth() {
	
	interest=balance*0.3;
	return interest;
	}
}
class Visa extends CreditCard{
	
}
class AX extends CreditCard{
	double meth() {
		
		interest=balance*0.45;
		return interest;
		}
}