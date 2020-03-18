package yeniOgrendiklerimSelf;
class Arearec{
	int length;
	int width;
	int area;
	
	int input(int l, int w){
	width=w;
	length=l;
	area=w*l;
	return area;
	}
	
	void display() {
		System.out.println("i am a rectangle with width "+width+" and length "+length+" and area "+area);
	}	
}

public class AreaRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arearec a1=new Arearec();
		Arearec a2=new Arearec();
		System.out.println(a1.input(30, 40));
		System.out.println(a2.input(12, 5));
		a1.display();
		a2.display();
	}

}
