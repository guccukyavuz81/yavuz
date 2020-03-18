package yeniOgrendiklerimSelf;

class Ar{
	
	int length;
	int width;
	
	void data(int w, int l) {
    width=w;
    length=l;
	}
	void area() {
	System.out.println("my width is  "+width+" my length is "+length+"and my area is "+width*length);
	}	
}

public class Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ar r1=new Ar ();
		Ar r2=new Ar ();
		r1.data(20, 30);
		r2.data(15, 6);
		r1.area();
		r2.area();
	}

}
