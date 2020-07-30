package com.syntax.class26;

import java.util.ArrayList;

public class ArrLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> s=new ArrayList<>();
		s.add("hi");
		s.add("yo");
		s.add("sup");
		s.add("yolo");
		s.add("boop");
		
		s.remove(4);
		s.remove(2);
		s.remove(0);
		
		for(int x=0; x<s.size();x++) {
			System.out.print(s.get(x)+" ");
		}



	}

}
