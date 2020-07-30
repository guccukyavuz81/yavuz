package selfMarch20;


public class S182 {

	int x;
	int y;
	public void doStuff(int x,int y) {
		x=x;
		y=this.y;
		
	}
	public void display() {
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		S182 m1=new S182();
		m1.x=100;
		m1.y=200;
		
		S182 m2=new S182();
		m2.doStuff(m1.x, m2.y);
		m1.display();
		m2.display();
		
		
	}

}
