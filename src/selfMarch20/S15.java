package selfMarch20;

class Caller{
	public void init() {
		System.out.println("initialized");
	}
	public void start() {
		init();
		System.out.println("statrted");
	}
}

public class S15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caller c=new Caller();
		c.start();   //The method start() from the type Caller is not visible
		c.init();    //The method init() from the type Caller is not visible
		 	}

}
