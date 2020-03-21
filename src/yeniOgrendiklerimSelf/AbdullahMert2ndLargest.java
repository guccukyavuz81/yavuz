package yeniOgrendiklerimSelf;
import java.util.Scanner;
public class AbdullahMert2ndLargest {

	public static void main(String[] args) {
		// cok cilgin CALISIYOR

		Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to enter...:");
        int temp;
        int count = input.nextInt();
        int[] nums = new int[count];
        // entering the items into the array
        for (int i = 0; i < count; i++) {
               System.out.println("Enter the number " + (i + 1) + " :");
               nums[i] = input.nextInt();
        }
        // sorting the items in the array- ascending order
        for (int j = 0; j < count; j++) {
               for (int k = j + 1; k < count; k++) {
                     if (nums[j] > nums[k]) {
                            temp = nums[j];
                            nums[j] = nums[k];
                            nums[k] = temp;
                     }
               }
        }
        // second largest
        System.out.println("Second Largest element in the array is "
                     + nums[nums.length - 2]);
        // minimum
        System.out.println("The smalles element in the array is " + nums[0]);
        // maximum
        System.out.println("The largest number in the array is "
                     + nums[nums.length - 1]);

	}

}
