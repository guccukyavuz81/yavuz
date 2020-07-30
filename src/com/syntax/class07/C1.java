package com.syntax.class07;

//class C2{
//	public void displayC2(){
//	System.out.println("C2");	
//	}
//}
//interface I{
//	public void displayI();
//}



public class C1 {//extends C2 implements I{

//	public void displayI() {
//		System.out.println("C1");
//	}
	static int count=0;
	int i=0;
	public void changecount() {
		while(i<5) {
			i++;
			count++;
		}
	}
	
	public static void main(String[] args) {
//		C2 obj1=new C1();
//		I obj2=new C1();
//		C2 s=obj2;
//		I t=obj1;
//		
//		t.displayI();
//		s.displayC2();
		C1 c1=new C1();
		C1 c2=new C1();
		c1.changecount();
		c2.changecount();
		System.out.println(c1.count+" "+c2.count);
	}
}
