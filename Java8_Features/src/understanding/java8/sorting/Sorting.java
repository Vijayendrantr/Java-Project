package understanding.java8.sorting;

public class Sorting {

	public static void main(String[] args) {
		
		SelectionSort ss = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ss.sort(arr);
        System.out.println("Selection Sorted array");
        ss.printArray(arr);
        
        BubbleSort bs = new BubbleSort();
        int arr1[] = {64, 34, 25, 12, 22, 11, 90};
        bs.bubbleSort(arr1);
        System.out.println("Bubble Sorted array");
        bs.printArray(arr);
        
        MergeSort ms = new MergeSort();
        int arr2[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given Array");
        ms.printArray(arr2);
        ms.sort(arr, 0, arr.length - 1);
        System.out.println("\nMerge Sorted array");
        ms.printArray(arr2);
		
	}
}