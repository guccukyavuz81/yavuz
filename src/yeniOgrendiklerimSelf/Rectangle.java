package yeniOgrendiklerimSelf;
class rec{
	
	
	
	static int area(int width, int length) {
		int area=width*length;
		return area;
		
	}
	static void display(int width,int length) {
		System.out.println("my dimentions are "+width+"*"+length);
		
	}
	
}
public class Rectangle {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	rec.display(20, 30);

	System.out.println("my area is "+rec.area(20, 30));
	}

}
