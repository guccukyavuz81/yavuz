package yeniOgrendiklerimSelf;
class Arearec{
	int length;
	int width;
	int area;
	
	Arearec (int w, int l){
		width=w;
		length=l;
		area=width*length;
		System.out.println("i am a rectangle with width "+width+" and length "+length+" and area "+area);
	}
	//int input(){
	//area=width*length;
	//return area;
	//}
	//void display() {
	//	System.out.println("i am a rectangle with width "+width+" and length "+length+" and area "+area);
	}	


public class AreaRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arearec a1=new Arearec(20,30);
		Arearec a2=new Arearec(12,5);
		//System.out.println("i am a rectangle with width "+a1.width+" and length "+a1.length+" and area "+a1.area);
		//System.out.println("i am a rectangle with width "+a2.width+" and length "+a2.length+" and area "+a2.area);
		
	}

}
