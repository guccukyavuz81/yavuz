package com.syntax.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskForce {

	
	    static List<Exception> exc(){
		List<Exception> list=new ArrayList<Exception>();
		
		int x=2;
		int y=0;
		try {
			int z=x/y;	
		}catch(ArithmeticException a) {
		//	System.out.println("caught ArithmeticException");
		//	a.printStackTrace();
			list.add(a);
		}
		
		int[] arr= {1,2,3};
		try {
			System.out.println(arr[3]);
		}catch(IndexOutOfBoundsException n){
		//	n.printStackTrace();
		//	System.out.println("caught IndexOutOfBoundsException");
			list.add(n);
		}
		try {
			Object ob = new Double(50);
			Integer i = (Integer) ob;
		} catch (ClassCastException c) {
			list.add(c);
		}
		try {
			int[] negArray = new int[-1];
		} catch (NegativeArraySizeException e) {
			list.add(e);
		}
		
		return list;
	}
	
	
	
	public static void main(String[] args) {
//Create a static method that will return a List of Exceptions.
//Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
//Call your method inside main and print name and details of all Exception objects.
//
		List<Exception> list=exc();
		
		Iterator<Exception> it=list.iterator();
		
		while(it.hasNext()) {
		System.out.println(it.next()); //hoca bunda israr ediyor... ama asgidaki calisiyor print li ya da degil
		}
//		System.out.println();
//		System.out.println("or just by invoking the method just as good");

//		exc();
     	System.out.println("rest of the code");
	}

}
