package selfMarch20;

public class S128 {

	void readCard(int cardNo)throws Exception{
		System.out.println("Reading card");
	}
	void checkCard(int cardNo)throws RuntimeException{
		System.out.println("checking card");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		S128 t=new S128();
		int cardNo=12344;
	//	t.readCard(cardNo);   Unhandled exception type Exception
		t.checkCard(cardNo);
	}

}
