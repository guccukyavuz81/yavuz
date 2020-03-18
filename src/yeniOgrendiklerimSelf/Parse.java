package yeniOgrendiklerimSelf;

public class Parse {

	public static void main(String[] args) {
		// convert a string into int

		
		String s="1234";
		
		int x=Integer.parseInt(s);
		
		System.out.println(x);
		
		System.out.println("............ALTERNATIVE WAY.................");
		
		System.out.println(Integer.valueOf(s));
		System.out.println("TO MAKE SURE IF THAT'S CONVERTED TO int");
		
		//System.out.println("let's try with string : " +s/4);  ---> DIDN'T WORK COZ IT WAS A STRING
		System.out.println("after conversion to int: " +Integer.valueOf(s)/4);
		
	}

}
