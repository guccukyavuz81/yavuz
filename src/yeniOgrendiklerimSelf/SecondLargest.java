package yeniOgrendiklerimSelf;

public class SecondLargest {

	public static void main(String[] args) {
		// SECOND LARGEST CALISMIYOR

		int[] numbers = { 3211, 610, 16, 89, 74, 25 };
		int smallest = numbers[0];
		int largest = numbers[0];
		int largest2 = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			int element = numbers[i];
			// check if it is bigger than the largest
			if (element > largest) {
				largest2 = largest;
				largest = element;
			} else if (element > largest2) { // check if it is bigger than second largest
				largest2 = element;
			}
			if (element < smallest) {
				smallest = element;
			}
		}
		System.out.println("Smallest " + smallest);
		System.out.println("Largest " + largest);
		System.out.println("Second Largest " + largest2);
		
}
}