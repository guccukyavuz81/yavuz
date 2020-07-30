package com.syntax.class22;

public class Alt {

	double meth(double balance,double interestrate) {
		double interest=balance*interestrate;
		return interest;
		}
}
class Visaa extends Alt{

	@Override
	double meth(double balance, double interestrate) {
		// TODO Auto-generated method stub
		return super.meth(balance, interestrate);
	}
	
}
class AXX extends Alt{

	@Override
	double meth(double balance, double interestrate) {
		// TODO Auto-generated method stub
		return super.meth(balance, interestrate);
	}
	
}