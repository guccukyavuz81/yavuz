package com.syntax.class15;

public class Ret {

	static char average(double x) {
		char grade=0;
		if(x<50) {
		grade='F';
		}else if(x>=50&&x<60) {
			grade='D';
	}else if(x>=60&&x<70) {
		grade='C';
	}else if(x>=70&&x<85){
		grade='B';
	}else if(x>=85&&x<=100){
		grade='A';
	}
		return grade;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("in the same class");
		System.out.println(average(100));
		char u=average(35);
		if(u=='A'||u=='B'||u=='C'||u=='D') {
			System.out.println("yirttin");
		}else {
			System.out.println("Allah belani versin");
		}
		
		
		int t=LargerMethod.largest(12,341,1);
		int w=101;
		if(t<w) {
			System.out.println("t kucuk");
		}else {
			System.out.println("t buyuk");
		}
	}

}
