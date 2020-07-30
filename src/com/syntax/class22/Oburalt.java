package com.syntax.class22;

public class Oburalt {

	double balance,interestrate;
	
	Oburalt(double balance,double interestrate){
		this.balance=balance;
		this.interestrate=interestrate;
	}
	double meth() {
		
		double interest=balance*interestrate;
		return interest;
	}
	
}
class Visaaa extends Oburalt{
	
	Visaaa(double balance,double interestrate){
		super(balance,interestrate);
	}
}
class AXXX extends Oburalt{
	AXXX(double balance,double interestrate){
		super(balance,interestrate);
	}
}