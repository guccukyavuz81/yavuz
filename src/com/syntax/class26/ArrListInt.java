package com.syntax.class26;

import java.util.ArrayList;
import java.util.Collections;

public class ArrListInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> num= new ArrayList<>();
		num.add(12);
		num.add(121);
		num.add(213);
		num.add(43);
		System.out.println(num);
		
		Collections.sort(num);  //sorts below
		for(int x=0; x<num.size(); x++) {
			System.out.println(num.get(x));
		}

		
		
	}

}
