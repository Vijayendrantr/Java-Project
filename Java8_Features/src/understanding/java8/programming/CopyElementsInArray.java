package understanding.java8.programming;

public class CopyElementsInArray {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// Displaying elements in array
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("array 1 : " + arr1[i]);
		}

		// Displaying elements in array
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("array 2 : " + arr2[i]);
		}
	}
}
