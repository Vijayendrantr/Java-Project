package understanding.java8.programming;

public class LargestElementInArray {
	
	public static void main(String[] args) {
		
		int[] arr = new int[]{123,234,654,22,78,909};
		
		int max = arr[0];
		
		for(int i=0; i<arr.length;i++){
			if(arr[i] >max) {
				max = arr[i];
			}
		}
		
		System.out.println("Largest Element : " + max);
	}

}
