package yeniOgrendiklerimSelf;

class Ar{
	
	int length;
	int width;
	
	Ar(int w, int l) {
    width=w;
    length=l;
	}
	void area() {
	System.out.println("my width is  "+width+" my length is "+length+" and my area is "+width*length);
	}	
}

public class Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ar r1=new Ar(25,6);
		Ar r2=new Ar (12,15);
	
		r1.area();
		r2.area();
	}

}
