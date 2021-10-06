package week1.day2;

import java.util.Arrays;

public class FindSecondLargest_Assignment2 {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int n=data.length-1;
		Arrays.sort(data);
		for(int i=0; i<data.length ; i++){
		System.out.println(data[i]);
		}	
		System.out.println("Size of array is: " +n);
		System.out.println("Second largest Number is: " +data[n-1]);	
	}}
	 
	


