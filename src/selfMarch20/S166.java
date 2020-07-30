package selfMarch20;

public class S166 {

	int count;
	public static void displaymsg() {
		//count++; //Cannot make a static reference to the non-static field count
		//System.out.println("welcome "+count);   //Cannot make a static reference to the non-static field count
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[];
		numbers=new int[2];
		numbers[0]=10;
		numbers[1]=20;
		numbers=new int [4];
		numbers[2]=30;
		numbers[3]=40;
		for(int x:numbers) {
			System.out.println(" "+x);
		}
	}

}
