package yeniOgrendiklerimSelf;
class rec{
	
	static int width;
	static int length;
	
	static int area(int w, int l) {
		width=w;
		length=l;
		int area=w*l;
		return area;	
	}
	static void display() {
		System.out.println("my dimentions are "+width+"*"+length);
	}
}
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println("my area is "+rec.area(20, 30));
	rec.display();
	}

}
