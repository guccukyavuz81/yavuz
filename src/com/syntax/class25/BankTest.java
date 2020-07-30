package com.syntax.class25;


interface Trustable{
	void trust();
}
interface Bank extends Trustable{
	void deposit();
	void withdraw();
}
interface CreditUnion{
	void givecredit();
}
class Finance {
	void financing() {
		System.out.println("does financing");
	}
}
class BOA extends Finance implements Bank,CreditUnion{

	@Override
	public void trust() {
		System.out.println("BOA is trustable");
		
	}

	@Override
	public void deposit() {
		System.out.println("can deposit at BOA");
		
	}

	@Override
	public void withdraw() {
		System.out.println("can withraw at BOA");
		
	}

	@Override
	public void givecredit() {
		System.out.println("BOA gives credit");
		
	}
}
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BOA b=new BOA();
		b.trust();
		b.deposit();
		b.financing();
		b.givecredit();
		b.withdraw();
		System.out.println("----------------------------------------");
		Bank ba=new BOA();
		ba.deposit();
		ba.trust();
		ba.withdraw();
	}

}
