package com.syntax.class22;

public class Bank {

	double money,fee;
	
	Bank(double money){
		this.money=money;
	}
	
	double chargefee() {
		if(money<1000) {
			fee=money*0.2;
		}
		return fee;
	}
}
class TD extends Bank{
	
	TD(double money){
		super(money);
	}

	double chargefee() {
		if(money<1000) {
			fee=money*0.3;
		}
		return fee;	
	
	}
	
	
}