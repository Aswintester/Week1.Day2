package week1.day2;

import java.util.Arrays;

public class Anagram_Assignment3 {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length()==text2.length()) {
			char [] arr1 =text1.toCharArray();
			char [] arr2 = text2.toCharArray();
		
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			//System.out.print(arr1);
		
			//System.out.print(arr2);
			
			for (int i = 0; i < text1.length(); i++) {
	            if (arr1[i] == arr2[i])
	            {
	            	System.out.println("Given words are anagram");
	            }
	            else {
	            	System.out.println("Given words are not an anagram");
	            }
		}
	}

}
}
/*
 * Pseudo Code
  
 *Declare a String 
	String text1 = "stops";
 *Declare another String
	String text2 = "potss"; 
 * a) Check length of the strings are same then (Use A Condition)
 * b) Convert both Strings in to characters
 * c) Sort Both the arrays
 * d) Check both the arrays has same value
 * 
 */
