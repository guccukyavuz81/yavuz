package com.syntax.class22;

public class Area {

	double ar(double x, double y) {
		double are=x*y;
		System.out.println("area of rectangle is "+are);
		return are;
	}
	double ar(double radius) {
		double are=radius*radius*3.14;
		System.out.println("area of circle is "+are);
		return are;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area a=new Area();
		a.ar(2.3, 5.8);
		a.ar(2.167);
	}

}
