package com.syntax.class17;

public class Task {

	protected int met(int[] array) {
	int sum=0;
	for(int x=0; x<array.length; x++) {
	sum=sum+array[x];
	}
	return sum;		
	}
	
	
	public static void main(String[] args) {
		//Create a method that will accept an array as parameters and will return a sum of all elements from that array.
		//Method should be visibly only within same package and accessible by the creating an instance of the class.

		Task t=new Task();
		int [] array={12,21,34,65};
		
		System.out.println("sum of that array is aha burda "+t.met(array));
	}

}
