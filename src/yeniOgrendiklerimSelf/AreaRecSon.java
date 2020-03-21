package yeniOgrendiklerimSelf;

class Arr{
	
int length;
int width;
int area;

int area(int l, int w){
width=w;
length=l;
area=w*l;
return area;
}

void display() {
	System.out.println("i am a rectangle with width "+width+" and length "+length+" and area "+area);
}	
}

public class AreaRecSon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arr a1=new Arr();
		Arr a2=new Arr();
		System.out.println(a1.area(20, 50));
		System.out.println(a2.area(12, 9));
		a1.display();
		a2.display();

	}

}
