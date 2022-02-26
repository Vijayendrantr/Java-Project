package understanding.java8.programming;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Original array: ");
		printArray(arr);
		
		System.out.println();
		
		System.out.println("Array in reverse order using for loop: ");
		// Loop through the array in reverse order
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Array in reverse order using temp variable : ");
		reverseArray(arr, 0, 4);
		
	}
	
	private static void reverseArray(int[] arr, int start, int end) {
		
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		printArray(arr);
		
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
