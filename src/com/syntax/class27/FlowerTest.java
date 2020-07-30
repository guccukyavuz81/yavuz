package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

abstract class Flower{
	String type;

	Flower(String type) {
		this.type = type;
	}	
	abstract void bloom();
		
	
}
class Tulip extends Flower{

	Tulip(String type) {
		super(type);
	}
	void bloom() {
		System.out.println(type+" blooms in april");
	}
}
class Rose extends Flower{

	Rose(String type) {
		super(type);
	}
	void bloom() {
		System.out.println(type+" blooms in may");
	}
}

public class FlowerTest {

	public static void main(String[] args) {
		//store flowers into array

		Flower[] ar= {new Tulip("tulip"),new Rose("rose")};
		for(Flower f:ar) {
			f.bloom();
		}
		//store into arraylist
		
		ArrayList<Flower> f=new ArrayList<>();
		f.add(new Tulip("tulip"));
		f.add(new Rose("rose"));
		
		for(Flower fl:f) {
			fl.bloom();
		}
		
		Iterator<Flower> it=f.iterator();
		while(it.hasNext()) {
			it.next().bloom();
		}

	}

}
