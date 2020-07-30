package selfMarch20;

class S1{
	protected void display(int x) {
	System.out.println("Parent" +x);	
	}
}
class S2 extends S1{
	public void display(int x,int y) {
		this.display(x);
		display(y);
		super.display(y);
	}
	public void display(int x) {
		System.out.println("Child "+x);
	}
}

public class V18s186 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		S2 obj=new S2();
		obj.display(10, 100);
	}

}
