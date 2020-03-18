package yeniOgrendiklerimSelf;
import java.util.Scanner;
public class ArrDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		int sum=0;
		int odd=0;
		int avr=0;
		Scanner input=new Scanner(System.in);
		int [] nums=new int[5];
		System.out.println("enter 5 nums");
		for(x=0; x<5; x++) {
			nums[x]=input.nextInt();
		}
		for(x=0; x<nums.length; x++) {
			if(nums[x]%2==1) {
		//for(int a:nums) {
			//if(a%2==1) {
			odd+=1;
			sum=sum+nums[x];	
			avr=sum/odd;
			}
		}
		System.out.println(avr);
	}

}
