package yeniOgrendiklerimSelf;

class Circ{
	
int radius;

//Circ(int r){    EITHER OR
//radius=r;
Circ(int radius){
this.radius=radius;
}

double getArea(){
double area=radius*radius*3.14;
return area;
}
double getPerimeter() {
double perimeter=2*radius*3.14;
return perimeter;
}	
}
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circ c1=new Circ(1);
		Circ c2=new Circ(25);
		Circ c3=new Circ(125);
		
		System.out.println("area of circle with radius  "+c1.radius+" is "+c1.getArea());
		System.out.println("area of circle with radius  "+c2.radius+" is "+c2.getArea());
		System.out.println("area of circle with radius  "+c3.radius+" is "+c3.getArea());


	}

}
