package com.syntax.class09;

public class ClockForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int x=0; x<=23; x++) {
			for(int y=0; y<=59; y++) {
				if(y<10) {
					System.out.println(x+":"+"0"+y);
				}else {
					System.out.println(x+":"+y);
				}
				//buraya saniyeleri ekle
	}
		}
}
}