package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrListEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> num=new ArrayList<>();
		for(int x=0; x<=50; x++) {
			if(x%2==0) {
				num.add(x);
			}
		}
		Iterator<Integer> it=num.iterator();
		while(it.hasNext()) {
			if(it.next()%5==0) {
				it.remove();
			}
		}System.out.println(num);
	}

}
