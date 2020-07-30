package selfMarch20;

class CheckingAccount{
	public int amount;
	public CheckingAccount(int amount) {
		this.amount=amount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount=amount;
	}
	public void changeAmount(int x) {
		amount+=x;
	}
}

public class S118acct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckingAccount acct=new CheckingAccount((int)(Math.random()*1000));
		//acct.amount=0;        ok
		//acct.setAmount(0);    ok
		//acct.getAmount()=0;   The left-hand side of an assignment must be a variable
		acct.changeAmount(-acct.amount);   //ok
		System.out.println(acct.getAmount());
	}

}
