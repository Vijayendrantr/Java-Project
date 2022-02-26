package understanding.java8.programming;

public class SmallestElementInArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 212, 2, 35, 6, 3 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Smallest Number : " + min);

		// Sum of the elements in array
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of the elements in array : " + sum);

	}

}
