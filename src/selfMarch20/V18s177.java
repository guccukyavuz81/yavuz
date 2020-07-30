package selfMarch20;

class Bird{
	public void fly() {
		System.out.println("Fly");
	}
}
class Peacock extends Bird{
	public void dance() {
		System.out.println("Dance");
	}
}

public class V18s177 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird b=new Peacock();
		Peacock p=(Peacock)b;
		p.dance();
		p.fly();
	}

}
//Bird b=new Bird();  cevap bu demisler calismir : Bird cannot be cast to selfMarch20.Peacock
//Peacock p=(Peacock)b;
