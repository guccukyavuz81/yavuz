package com.syntax.class18;

class ConsAccess{
	
	public static void main(String[] args) {
		Task3 t=new Task3();
		Task3 tt=new Task3(3);
		//Task3 ttt=new Task3("ds"); not visible coz private
		Task3 tttt=new Task3('c');
}
}
public class Task3 {

	public Task3(){
		System.out.println("public");
	}
	protected Task3(int x){
		System.out.println("protected");
	}
	private Task3(String s){
		System.out.println("private");
	}
	Task3(char c){
		System.out.println("default");
	}
	
	
	public static void main(String[] args) {
		// Write a program  that will have 4 different access levels of constructors and create 3 objects of this class: 
//1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
		
		Task3 t=new Task3();
		Task3 tt=new Task3(3);
		Task3 ttt=new Task3("ds");
		Task3 tttt=new Task3('c');
		
	}

}
