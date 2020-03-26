package com.syntax.class15;

public class LargerMethod {

	static int largest(int x, int y,int z){
	int largest;
	if(x>y&&x>z)	{
		largest=x;
	}else if(y>x&&y>z){
		largest=y;
	}else {
		largest=z;
	}
	return largest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Larger.larger(12, 21));
		Larger.ev(21);
		Larger.pal("never odd or even");
		System.out.println(Larger.hi("djj"));
		
		String str="hello my friend";
		int length=str.length();
		if(length>10) {
			System.out.println("is large");
		}else {
			System.out.println("is small");
		}
		System.out.println(largest(15,87,12));
		System.out.println(Larger.ev(13));
	}
}
