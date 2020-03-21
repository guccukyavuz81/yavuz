package yeniOgrendiklerimSelf;

class Araba{
	
	//class                    object            method () 
	//template,blueprint       data,behavior
	
	String color;
	int mpg;
	int speed;
	String make;
	
	void speak(){
	System.out.println("my color is "+color+" I'm made in "+make+" and my consumption is "+mpg+" my speed is "+speed);	
	}
	int sum(int x,int y) {
	int toplam=x+y;
	return toplam;
	}
	
	boolean takim(){
	boolean fener=false;
	return fener;
	
	}		
}
public class Wednesday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Araba lexus =new Araba();
		Araba audi =new Araba();
		Araba saab=new Araba();
		lexus.color="silver";
		lexus.make="japan";
		lexus.mpg=20;
		lexus.speed=80;
		audi.color="blue";
		audi.make="germany";
		audi.mpg=25;
		audi.speed=90;
		lexus.speak();
		audi.speak();
		System.out.println(lexus.sum(12, 35));
		System.out.println(audi.sum(73, 87));
		System.out.println(audi.takim());
		
	}

}
