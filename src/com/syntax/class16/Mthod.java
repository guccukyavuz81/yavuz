package com.syntax.class16;

public class Mthod {
	
	int sum(int x,int y) {
		return x+y;
	}
	void summ(int w,int t) {
		System.out.println(w+t);
	}
	boolean isEqual(int a,int b) {
		boolean equal;
		if(a==b) {
		equal=true;
		}else {
		equal=false;
		}return equal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mthod m=new Mthod();
		System.out.println(m.sum(12, 48));
		m.summ(23, 32);
		int q=m.sum(10, 30)/10;
		System.out.println(q);
		System.out.println(m.isEqual(12, 21));
	}

}
