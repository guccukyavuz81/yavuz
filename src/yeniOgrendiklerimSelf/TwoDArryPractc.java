package yeniOgrendiklerimSelf;
import java.util.Scanner;
public class TwoDArryPractc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int counter=0;
		int sum=0;
		Scanner input=new Scanner(System.in);
		int [][] table=new int [2][2];
		System.out.println("enter "+table.length+" rows and "+table[0].length+" columns:");
		for(int x=0; x<table.length; x++) {
			for(int y=0; y<table[x].length; y++) {
				table[x][y]=input.nextInt();
				sum=sum+table[x][y];
				counter++;
			}
		}
		System.out.println("sum of these "+counter+" numbers is  "+sum);
	}

}
