package com.syntax.class24;

abstract class Phone{
	String name;
	public Phone(String name) {
		this.name = name;
	}
	void call() {
	System.out.println(name+" can call");	
	}
	void text() {
	System.out.println(name+" can text");	
	}
	abstract void takepic(); 
	abstract void playmusic();
}
class Iphone extends Phone{

	public Iphone(String name) {
		super(name);
	}

	@Override
	void takepic() {
		System.out.println(name+" takes apple pictures");
		
	}

	@Override
	void playmusic() {
        System.out.println(name+" plays apple music");		
	}
	
}
class Samsung extends Phone{

	public Samsung(String name) {
		super(name);
		
	}

	@Override
	void takepic() {
		System.out.println(name+" takes android pictures");
		
	}

	@Override
	void playmusic() {
        System.out.println(name+" plays android music");		
		
	}	
}

public class Abstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone [] p= {new Iphone("Iphone 7"),new Samsung("edge 6")};
		for(Phone ph:p) {
			ph.call();
			ph.text();
			ph.playmusic();
			ph.takepic();
		}
	}

}
