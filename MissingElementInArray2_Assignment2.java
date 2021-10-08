package week1.day2;

import java.util.Arrays;

public class MissingElementInArray2_Assignment2 {

	public static void main(String[] args) {
		int[] arr = {1,2,4,7,6,5,8};
		
		Arrays.sort(arr); //arr={1,2,3,4,6,7,8}
		for (int i=1; i< arr.length; i++) //length = index+1 =6+1=7
		{
			if(i!=arr[i-1]) {
				System.out.println(i);
				break;
			}
			
		}
		
}
}
