package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Magaza{
	String type,name;

	public Magaza(String type, String name) {
		this.type = type;
		this.name = name;
	}
	void display() {
		System.out.println(name+" store is a "+type);
	}
	abstract void workhours();
	
}
class Nike extends Magaza{

	public Nike(String type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void workhours() {
		System.out.println(name+"works all week except for Sunday");
		
	}
	
}
class SinekciBakkal extends Magaza{

	public SinekciBakkal(String type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void workhours() {
		System.out.println(name+" works till 11pm");
		
	}
	
}
class TekelciVeli extends Magaza{

	public TekelciVeli(String type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void workhours() {
		System.out.println(name+" works all day");
		
	}
	
}

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Magaza> m=new LinkedHashMap<Integer, Magaza>();
		m.put(1, new Nike(" Clothing "," Nike "));
		m.put(2, new SinekciBakkal(" Grocery Store "," SinekciBakkal "));
		m.put(3, new TekelciVeli(" Tekel Store "," TecelciVeli "));
		
		
		for(Entry<Integer, Magaza> f:m.entrySet()) {
			System.out.println("store # "+f.getKey()+" is such;");
			f.getValue().display();
			f.getValue().workhours();
		}

		m.forEach((k,v) -> v.display());
		m.forEach((k,v) -> v.workhours());
		
		Set<Entry<Integer, Magaza>> s=m.entrySet();
		for(Entry<Integer, Magaza> f:s) {
			System.out.println("here comes store # "+f.getKey());
			f.getValue().display();
			f.getValue().workhours();
		}
		
		Set<Integer> sm=m.keySet();
		System.out.println(sm);
		
		Collection<Magaza> co=m.values();
		for(Magaza mag:co) {
			mag.display();
			mag.workhours();
		}
	}

}
