package understanding.java8.programming;

import java.util.Arrays;

public class All_Programs {
	
	static int x1=0,x2=1,x3=0;
	
	public static void main(String[] args) {
		
		checkForAnagram();
		copy_elements_in_array();
		duplicate_elements_in_array();
		factorial();
		fibonacci_series();
		largest_elements_in_array();
		smallest_element_in_array();
		sum_of_array();
		largest_number();
		palindrome_number();
		reverse_number();
		palindrome_string();
		reverse_array();
		reverse_string();
		swap_numbers();
		prime_number();
		reverse_string_array();
		second_largest_number_in_array();
		merge_two_sorted_arrays();
		armstrong_number();
	}

	private static void armstrong_number() {
		int x = 153;
		System.out.println(isArmstrong(x));
	}

	// Function to check whether the given number is
	// Armstrong number or not
	static boolean isArmstrong(int x) {
		// Calling order function
		int n = order(x);
		int temp = x, sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + power(r, n);
			temp = temp / 10;
		}

		// If satisfies Armstrong condition
		return (sum == x);
	}
	
	/* Function to calculate order of the number */
	static int order(int x) {
		int n = 0;
		while (x != 0) {
			n++;
			x = x / 10;
		}
		return n;
	}
	
	/*
	 * Function to calculate x raised to the power y
	 */
	static int power(int x, long y) {
		if (y == 0)
			return 1;
		if (y % 2 == 0)
			return power(x, y / 2) * power(x, y / 2);
		return x * power(x, y / 2) * power(x, y / 2);
	}

	private static void merge_two_sorted_arrays() {
		int[] arr1 = new int[] {1,3,5,7};
		int n1 = arr1.length;
		
		int[] arr2 = new int[] {2,4,6,8};
		int n2 = arr2.length;
		
		int[] arr3 = new int[n1+n2];
		
		mergeArrays(arr1, arr2, n1, n2, arr3);
		
		System.out.println("Array after merging");
		for(int i=0;i<n1+n2; i++) {
			System.out.print(" " + arr3[i]);
		}
	}

	private static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		int i=0, j=0, k=0;
		
		while(i<n1 && j<n2) {
			if(arr1[i] < arr2[j]) {
				arr3[k++]=arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			}
		}
		// Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];
        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
	}

	private static void second_largest_number_in_array() {
		int[] inputArray = new int[] { 12, 34, 7, 9, 99,101 };
		int max = 0;
		int secondLargest = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] > max) {
				secondLargest = max;
				max = inputArray[i];
			} else {
				if (inputArray[i] > secondLargest && inputArray[i] != max) {
					secondLargest = inputArray[i];
				}
			}
		}
		System.out.println("Largest = " + max + " Second Largest = " + secondLargest);
	}

	private static void reverse_string_array() {
		String[] strArray = {"Vijay","Ashish","Shankar"};
		for(int i=0; i<strArray.length;i++){
			System.out.println("Before Reversing : " + strArray[i]);
		}
		for(int i=strArray.length-1;i>=0;i--){
			System.out.println("Reversing : " + strArray[i]);
		}
		Arrays.sort(strArray);
		for(int i=0; i<strArray.length;i++){
			System.out.println("After Sorting : " + strArray[i]);
		}
	}

	private static void prime_number() {
		int i, m=0, flag=0;
		int n = 11;
		m = n/2;
		if(n==0 || n==1) {
			System.out.println("Not prime numbers");
		} else {
			for(i=2; i<=m; i++) {
				if(n%i == 0 ) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		}
	}

	private static void swap_numbers() {
		//With temp variable
		int a =99, b=77, c;
		c=a+b;//30
		b=c-b;//20
		a=c-a;
		System.out.println("a = "  + a + " b = " + b);
		
		//without temp variable
		int x=20, y=30;
		x = x + y; // 50
		y = x - y; //20
		x = x - y; 
		System.out.println("x = " + x + " y = " + y);
	}

	private static void reverse_string() {
		String str = "String";
		char ch;
		String reverse = "";
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println("reverse = " + reverse);
	}

	private static void reverse_array() {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int start=0, end=4;
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	private static void palindrome_string() {
		String s = "madam";
		int i=0 , j=s.length()-1;
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)){
				System.out.println("Not a palindrome");
			} else {
				i++;
				j--;
			}
		}
		System.out.println("Palindrome");
	}

	private static void reverse_number() {
		int number = 991;
		int reverse = 0;
		while(number>0){
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Reverse Number = " + reverse);
	}

	private static void palindrome_number() {
		int number = 1221, a;
		int reverse = 0;
		a= number;
		while(a > 0) {
			int remainder = a % 10;
			reverse = reverse * 10 + remainder;
			a = a/10;
		}
		System.out.println("reverse : " + reverse);
		if(number == reverse) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not Palindrome");
		}
	}

	private static void largest_number() {
		int a=10, b=30, c=46;
		int temp = a>b?a:b;
		System.out.println("Temp : " + temp);
		int largeNum = temp>c?temp:c;
		System.out.println("largeNum : " + largeNum);
	}

	private static void sum_of_array() {
		int[] inputArray = new int[] {12,23,42,11,10};
		int sum=0;
		for(int i=0; i<inputArray.length;i++) {
			sum = sum + inputArray[i];
		}
		System.out.println("Sum of Array Elements : " + sum);
	}

	private static void smallest_element_in_array() {
		int[] inputArray = new int[] {12,23,42,11,10};
		int smallestElement = inputArray[0];
		for(int i=0; i<inputArray.length;i++) {
			if(inputArray[i] < smallestElement){
				smallestElement = inputArray[i];
			}
		}
		System.out.println("Smallest Element : " + smallestElement);
	}

	private static void largest_elements_in_array() {
		int[] inputArray = new int[] {12,23,42,11,10};
		int largestElement = inputArray[0];
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i] >  largestElement) {
				largestElement = inputArray[i];
			}
		}
		System.out.println("Largest Element : " + largestElement);
	}

	private static void fibonacci_series() {
		    
		int count=10;
		System.out.print(x1 + " " + x2);
		printFibonacci(count-2);
		
	}

	private static void printFibonacci(int count) {
		if(count > 0) { 
			int x3 = x1 + x2;
			x1 = x2;
			x2 = x3;
			System.out.print(" "+x3);   
			printFibonacci(count-1);
		}
	}

	private static void factorial() {
		int i, fact=1;
		int number = 3;
		for(i=1; i<=number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is - " + fact);
	}

	private static void duplicate_elements_in_array() {
		int[] srcArray = new int[] {1,2,3,4,2,3,4,5,5,1,7};
		for(int i=0; i<srcArray.length;i++) {
			for(int j = i+1; j<srcArray.length;j++) {
				if(srcArray[j] == srcArray[i]) {
					System.out.println("Duplicate Elements are : " + srcArray[i]);
				}
			}
		}
	}

	private static void copy_elements_in_array() {

		int[] numArray = new int[] { 1, 2, 3, 4, 5 };
		int[] copyArray = new int[numArray.length];
		for(int i=0; i<numArray.length; i++) {
			copyArray[i] = numArray[i];
		}
		
		for(int i=0;i<numArray.length; i++){
			System.out.println(numArray[i]);
		}
		
		for(int i=0;i<copyArray.length; i++){
			System.out.println(copyArray[i]);
		}
	}

	private static void checkForAnagram() {
		
		String s1 = "heart";
		String s2 = "earth";
		
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");
		
		//check if s1 and s2 are of same length
		if(str1.length() == str2.length()) {
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();
			System.out.println(ch2);
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean status = ch1.equals(ch2);
			System.out.println(status);
			if(Arrays.equals(ch1, ch2)){
				System.out.println("They are anagram");
			}
		} else {
			System.out.println("Not a anagram");
		}
	}
}
