package com.syntax.class22;

public class Final {

	static String str="hello";
	
	static final String str1="bye";
	//final String kelime; not initializez--> coz u declare it final u need to assign a value coz it can't be changed
	
	final static String son="son lan bu";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//str1="KFKJKF"; U CAN'T COZ ITS FINAL
		
		//son="kjdhff"; The final field Final.son cannot be assigned
		
	}

}
class Sub extends Final{
	

}
class Exe{
	public static void main(String[] args) {
		
		Final.str="mirabaaa";
		System.out.println(Final.str);
		//Final.str1="trtwww";  The final field Final.str1 cannot be assigned
		System.out.println(Final.str1);
	}
}