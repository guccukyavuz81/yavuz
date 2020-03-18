package yeniOgrendiklerimSelf;
import java.util.Scanner;
public class ArryMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter=0;
		int x=0;
		int max=0;
		Scanner input=new Scanner(System.in);
		int [] nums=new int[5];
		System.out.println("enter 5 nums");
		for(x=0; x<nums.length; x++){
			nums[x]=input.nextInt();
			counter++;
		}
		//for(int a:nums) {
			//if(a>max) {
				//max=a;
			//}
		//}
		for(x=0; x<nums.length; x++) {
			if(nums[x]>max) {
				max=nums[x];
			}
		}
		System.out.println("max value between these "+counter+" numbers is "+max);
	}


}
