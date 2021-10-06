package week1.day2;

import java.util.Arrays;

public class MissingElementInArray_Assignment2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8,9 };
		int sum = 0;
		int sumofall = 0;
		int n;
		n = arr.length + 1; // to find total numbers/range in given array
		System.out.println("length of array= :" + n);

		Arrays.sort(arr); // Sorting
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + sum; // to find sum of given array
		}
		System.out.println("Sum of given array= " + sum);

		sumofall = n * (n + 1) / 2; // to find total sum of range of array
		System.out.println("Sum of array range= " + sumofall);

		int missingnumber = sumofall - sum; // to find missing number
		System.out.println("Missing Number in array is= " + missingnumber);
	}
}
