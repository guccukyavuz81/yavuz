package yeniOgrendiklerimSelf;

public class LargestBayramgul {

	public static void main(String[] args) {
		// BU HER DURUMDA CALISIYOR
		int[] a = { 900,12, 34, 67, 89, 23, 98 };
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		int second = min;
		for (int j = 0; j < a.length; j++) {
			if(a[j]>second && a[j]!=max) {
				second=a[j];
			} 
		}
		System.out.println("The largest number is: " + max);
		System.out.println("The second largest number is: " + second);
		System.out.println("The min number is: " + min);
	}

}
